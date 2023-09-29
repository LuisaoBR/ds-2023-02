package newton;

public class Newton {
	
	public Newton() {
		
	}
	
	// Método para calcular a raiz quadrada usando o Método de Newton
	public double calcularRaizQuadrada(double numero, double tolerancia) {
        // Inicialização do palpite inicial (pode ser qualquer número positivo)
        double palpite = numero;

        // Loop até que a diferença entre palpite e o resultado real seja menor que a tolerância
        while (Math.abs(palpite * palpite - numero) > tolerancia) {
            // Atualiza o palpite usando a fórmula de Newton
            palpite = 0.5 * (palpite + numero / palpite);
        }

        return palpite;
        
    }

}
