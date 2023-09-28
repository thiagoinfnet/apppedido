package br.edu.infnet.apppedido.model.domain;

public class Livro extends Produto {

	private String genero;
	private String autor;
	private String editora;
	
	public Livro(String nome, float valor, int codigo, String genero, String autor, String editora) {
		super(nome, valor, codigo);
		this.genero = genero;
		this.autor = autor;
		this.editora = editora;
	}
	
	@Override
	public String toString() {
		return String.format("%s;%s;%s;%s",
				super.toString(),
				genero,
				autor,
				editora
			);
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
}
