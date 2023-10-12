package br.inf.ufg.ds.planilha;
import java.util.*;

public class Celula {
	private String nome;
	private int valor;
	private List<Celula> observadores;

	public Celula(String nome) {
		this.nome = nome;
		this.valor = 0;
		this.observadores = new ArrayList<>();
	}

	public void setValor(int valor) {
		if (this.valor != valor) {
			this.valor = valor;
			notificarObservadores();
		}
	}

	public int getValor() {
		return valor;
	}

	public String getNome() {
		return nome;
	}

	public void adicionarObservador(Celula observador) {
		observadores.add(observador);
	}

	public void removerObservador(Celula observador) {
		observadores.remove(observador);
	}

	private void notificarObservadores() {
		for (Celula observador : observadores) {
			System.out.println("Reavaliar " + observador.getNome() + " por mudança ocorrida em " + this.getNome());
			observador.atualizar();
		}
	}

	public void atualizar() {
		//Somar os valores das células dependentes
		int novoValor = 0;
		for (Celula dependente : observadores) {
			novoValor += dependente.getValor();
		}
		setValor(novoValor);
	}

}
