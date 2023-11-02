package br.inf.ufg.ds.markdown;

public class Italico {
	private String texto;
	
	public Italico(String texto) {
		this.texto = texto;
	}
	
	public void exibe() {
		System.out.println("_"+this.texto+"_");
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	

}
