package classe;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.MatchResult;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassFinder {
	public static void main(String[] args) throws IOException {
		if (args.length < 2) {
			System.out.println("Uso: fc <nome da classe> <dir> [-p]");
			return;
		}

		String nomeClasse = args[0];
		String dirPath = args[1];
		boolean useParallelStream = args.length > 2 && args[2].equals("-p");

		long tempoDeComeco = System.nanoTime();

		List<File> classeArquivos = findArquivosDeClasse(new File(dirPath), useParallelStream);
		List<String> locaisEncontrados = findClassesEmArquivos(classeArquivos, nomeClasse, useParallelStream);

		long tempoDeTermino = System.nanoTime();
		long tempoDecorrido = TimeUnit.NANOSECONDS.toMillis(tempoDeTermino - tempoDeComeco);

		if (locaisEncontrados.isEmpty()) {
			System.out.println("Classe não encontrada.");
		} else {
			System.out.println("Classe encontrada em:");
			for (String localizacao : locaisEncontrados) {
				System.out.println(localizacao);
			}
		}

		System.out.println("Tempo gasto: " + tempoDecorrido + " ms");
		System.out.println("Numero de arquivos .class consultados: " + classeArquivos.size());
	}

	private static List<File> findArquivosDeClasse(File directory, boolean useParallelStream) throws IOException {
		try (Stream<Path> files = Files.walk(directory.toPath())) {
			Stream<File> fileStream = useParallelStream ? files.parallel().map(Path::toFile) : files.map(Path::toFile);
			return fileStream.filter(file -> file.getName().endsWith(".class") || file.getName().endsWith(".jar") || file.getName().endsWith(".war"))
					.collect(Collectors.toList());
		}
	}

	private static List<String> findClassesEmArquivos(List<File> files, String className, boolean useParallelStream) {
		return files.stream()
				.filter(file -> {
					if (file.getName().endsWith(".class")) {
						try {
							String classContent = new String(Files.readAllBytes(file.toPath()));
							return classContent.contains(className);
						} catch (IOException e) {
							e.printStackTrace();
							return false;
						}
					} else if (file.getName().endsWith(".jar") || file.getName().endsWith(".war")) {
						try {
							return buscaClasseJarWar(file, className);
						} catch (IOException e) {
							e.printStackTrace();
							return false;
						}
					}
					return false;
				})
				.map(File::getAbsolutePath)
				.collect(Collectors.toList());
	}

	private static boolean buscaClasseJarWar(File file, String className) throws IOException {
		try (JarFile jarFile = new JarFile(file)) {
			Enumeration<JarEntry> entries = jarFile.entries();
			while (entries.hasMoreElements()) {
				JarEntry entry = entries.nextElement();
				if (!entry.isDirectory() && entry.getName().endsWith(".class")) {
					try (Stream<String> lines = new Scanner(jarFile.getInputStream(entry)).findAll(className).map(MatchResult::group)) {
						if (lines.findAny().isPresent()) {
							return true;
						}
					}
				}
			}
			return false;
		}
	}
}