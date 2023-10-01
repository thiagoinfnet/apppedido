package br.edu.infnet.apppedido.calcado;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.apppedido.produto.Produto;

@Entity
@Table(name = "TCalcado")
public class Calcado extends Produto {
	
	private int tamanho;
	private String cor;
	private String tipo;

	public Calcado() {
		
	}
	
	public Calcado(Integer id) {
		super(id);
	}
	
	public Calcado(String nome, float valor, int codigo, int tamanho, String cor, String tipo) {
		super(nome, valor, codigo);
		this.tamanho = tamanho;
		this.cor = cor;
		this.tipo = tipo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
