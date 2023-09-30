package br.edu.infnet.apppedido.model.app;

public class Atributo {

	private String nome;
	private String tipo;
	private String descricao;
	
	public Atributo(String nome, String tipo, String descricao) {
		this.nome = nome;
		this.tipo = tipo;
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {

		return String.format("%s - %s - %s", nome, tipo, descricao);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}