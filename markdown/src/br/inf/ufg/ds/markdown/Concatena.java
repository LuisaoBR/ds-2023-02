package br.inf.ufg.ds.markdown;

public class Concatena {
	private TextoParaTexto texto1;
	private TextoParaTexto texto2;
	private String concatena;
	
	public Concatena(TextoParaTexto texto1,TextoParaTexto texto2,String concatena0) {
		this.texto1 = texto1;
		this.texto2 = texto2;
		this.concatena = texto1.getTexto()+texto2.getTexto();
	}
	
	public void exibe() {
		System.out.println(concatena);
	}

	public TextoParaTexto getTexto1() {
		return texto1;
	}

	public void setTexto1(TextoParaTexto texto1) {
		this.texto1 = texto1;
	}

	public TextoParaTexto getTexto2() {
		return texto2;
	}

	public void setTexto2(TextoParaTexto texto2) {
		this.texto2 = texto2;
	}

	public String getConcatena() {
		return concatena;
	}

	public void setConcatena(String concatena) {
		this.concatena = concatena;
	}
	
	

}
