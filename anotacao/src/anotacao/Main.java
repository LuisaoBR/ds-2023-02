package anotacao;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro("carro1");

		Motorista motorista = new Motorista();
		carro.addObserver(motorista);

		carro.acelerar();

	}

}
