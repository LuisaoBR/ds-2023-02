package newton;


public class Main {

	public static void main(String[] args) {
		
		double numero = 16.0; // O número do qual você deseja calcular a raiz quadrada
        double tolerancia = 1e-6; // Tolerância desejada (quão próximo da resposta real você deseja)

        Newton newton1 = new Newton();
        double resultado = newton1.calcularRaizQuadrada(numero, tolerancia);

        System.out.println("A raiz quadrada de " + numero + " é aproximadamente: " + resultado);

	}

}
