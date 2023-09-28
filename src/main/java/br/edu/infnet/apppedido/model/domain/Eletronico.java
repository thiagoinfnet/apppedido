package br.edu.infnet.apppedido.model.domain;

public class Eletronico extends Produto {

	private String sistemaOperacional;
	private String marca;
	private float peso;

	public Eletronico(String nome, float valor, int codigo, String sistemaOperacional, String marca, float peso) {
		super(nome, valor, codigo);
		this.sistemaOperacional = sistemaOperacional;
		this.marca = marca;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return String.format("%s;%s;%s;%.2f",
				super.toString(),
				sistemaOperacional,
				marca,
				peso
		);
	}

	public String getsistemaOperacional() {
		return sistemaOperacional;
	}

	public void setsistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
}
