package br.edu.infnet.apppedido.model.domain;

public class Roupa extends Produto {
	
	private String sexo;
	private String categoria;
	private String tamanho;

	public Roupa(String nome, float valor, int codigo, String sexo, String categoria, String tamanho) {
		super(nome, valor, codigo);
		this.sexo = sexo;
		this.categoria = categoria;
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return String.format("%s;%s;%s;%s",
				super.toString(),
				sexo,
				categoria,
				tamanho
		);
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
}
