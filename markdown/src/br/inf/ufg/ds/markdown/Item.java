package br.inf.ufg.ds.markdown;

public class Item {
	private TextoParaTexto texto;
	private String item;
	
	public Item(TextoParaTexto texto) {
		this.texto = texto;
		this.item = texto.getTexto();
	}
	
	public void exibe() {
		System.out.println(item);
	}

	public TextoParaTexto getTexto() {
		return texto;
	}

	public void setTexto(TextoParaTexto texto) {
		this.texto = texto;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
	

}
