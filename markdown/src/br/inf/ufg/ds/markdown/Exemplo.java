package br.inf.ufg.ds.markdown;

public class Exemplo {
	private Negrito negrito;
	private Italico italico;
	private Titulo titulo;
	
	public Exemplo(Negrito negrito,Italico italico,Titulo titulo) {
		this.negrito = negrito;
		this.italico = italico;
		this.titulo = titulo;
	}
	
	public void exibe() {
		System.out.println(this.titulo+"\n"+"Uma simples linha, com "+negrito+" e "+italico+".");
	}

	public Negrito getNegrito() {
		return negrito;
	}

	public void setNegrito(Negrito negrito) {
		this.negrito = negrito;
	}

	public Italico getItalico() {
		return italico;
	}

	public void setItalico(Italico italico) {
		this.italico = italico;
	}

	public Titulo getTitulo() {
		return titulo;
	}

	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
	}
	
	

}
