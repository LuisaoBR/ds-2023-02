package br.ufg.inf.testanewton;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		Function<Double, Double> sqrtFunction = x -> {
            if (x < 0) {
                throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de um número negativo.");
            }

            double estimativa = x; // Comece com uma estimativa inicial igual ao número
            double tolerancia = 1e-7; // Tolerância para a precisão da raiz
            int maxIteracoes = 100; // Número máximo de iterações

            for (int iteracoes = 0; iteracoes < maxIteracoes; iteracoes++) {
                double proxEstimativa = 0.5 * (estimativa + x / estimativa); // Fórmula do método de Newton
                if (Math.abs(proxEstimativa - estimativa) < tolerancia) {
                    return proxEstimativa; // Convergimos o suficiente
                }
                estimativa = proxEstimativa;
            }

            throw new IllegalStateException("Não foi possível encontrar uma estimativa precisa da raiz quadrada.");
        };

        double num = 25.0; // Número para o qual deseja calcular a raiz quadrada
        double result = sqrtFunction.apply(num);
        System.out.println("A raiz quadrada de " + num + " eh aproximadamente " + result);
	}

	}


