package br.inf.ufg.ds.planilha;

public class Main {

	public static void main(String[] args) {
		Celula A1 = new Celula("A1");
		Celula A2 = new Celula("A2");
		Celula A3 = new Celula("A3");

		A3.adicionarObservador(A1);
		A3.adicionarObservador(A2);

		A1.setValor(10);
		A2.setValor(20);

		System.out.println("Valor de A3: " + A3.getValor());
		A1.setValor(15);
		System.out.println("Novo valor de A3: " + A3.getValor());

	}

}
