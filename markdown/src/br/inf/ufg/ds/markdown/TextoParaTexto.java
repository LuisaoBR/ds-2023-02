package br.inf.ufg.ds.markdown;

public class TextoParaTexto {
	private String texto;
	
	public TextoParaTexto(String texto) {
		this.texto = texto;
	}
	
	public void exibe(String texto) {
		System.out.println(this.texto);
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	

}
