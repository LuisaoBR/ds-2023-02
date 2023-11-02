package decorator;

public class Main {

	public static void main(String[] args) {
		Expressao expressao = new Soma(new Constante(5), new Multiplica(new Constante(2), new Constante(3)));
		System.out.println("O valor da expressão é: " + expressao.valor()); // Deve resultar em 11.0

	}

}
