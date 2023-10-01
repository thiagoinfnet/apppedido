package br.edu.infnet.apppedido.roupa;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.apppedido.produto.Produto;

@Entity
@Table(name = "TRoupa")
public class Roupa extends Produto {
	
	private String sexo;
	private String categoria;
	private String tamanho;
	
	public Roupa() {
		
	}
	
	public Roupa(Integer id) {
		super(id);
	}

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
