package br.inf.ufg.ds.markdown;

public class Titulo {
	private String texto;
	
	public Titulo(String texto) {
		this.texto = texto;
	}
	
	public void exibe() {
		System.out.println("# "+this.texto);
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	

}
