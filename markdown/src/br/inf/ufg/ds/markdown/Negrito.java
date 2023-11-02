package br.inf.ufg.ds.markdown;

public class Negrito {
	private String texto;
	
	public Negrito(String texto) {
		this.texto = texto;
	}
	
	public void exibe() {
		System.out.println("**"+this.texto+"**");
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	

}
