package br.edu.infnet.apppedido.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.edu.infnet.apppedido.produto.Produto;
import br.edu.infnet.apppedido.solicitante.Solicitante;

public class Pedido {
	private String descricao;
	private LocalDateTime data;
	private boolean web;
	private Solicitante solicitante;
	private List<Produto> produtos;

	public Pedido() {
		descricao = "Pedido inicial";
		data = LocalDateTime.now();
		web = true;
	}

	public Pedido(String descricao, Solicitante solicitante, List<Produto> produtos) {
		this();
		this.descricao = descricao;
		this.solicitante = solicitante;
		this.produtos = produtos;
	}
	
	@Override
	public String toString() {
		return descricao + ";" + data + ";" + web + ";" + solicitante + ";" + produtos.size();
	}
}
