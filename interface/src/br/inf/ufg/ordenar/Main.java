package br.inf.ufg.ordenar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Estudante> listaEstudantes = new ArrayList<>();

        // Adicionar estudantes a lista
        listaEstudantes.add(new Estudante("Joao", 90.5, 20));
        listaEstudantes.add(new Estudante("Maria", 85.0, 22));
        listaEstudantes.add(new Estudante("Ana", 92.3, 21));
        listaEstudantes.add(new Estudante("Carlos", 78.2, 19));

        // Ordenar por nome
        Collections.sort(listaEstudantes, Comparator.comparing(Estudante::getNome));
        System.out.println("Ordenado por Nome:");
        listaEstudantes.forEach(System.out::println);

        // Ordenar por nota
        Collections.sort(listaEstudantes, Comparator.comparing(Estudante::getNota));
        System.out.println("\nOrdenado por Nota:");
        listaEstudantes.forEach(System.out::println);

        // Ordenar por idade
        Collections.sort(listaEstudantes, Comparator.comparingInt(Estudante::getIdade));
        System.out.println("\nOrdenado por Idade:");
        listaEstudantes.forEach(System.out::println);

	}

}
