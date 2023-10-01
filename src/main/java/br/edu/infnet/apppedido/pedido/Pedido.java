package br.edu.infnet.apppedido.pedido;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.edu.infnet.apppedido.produto.Produto;
import br.edu.infnet.apppedido.solicitante.Solicitante;
import br.edu.infnet.apppedido.usuario.Usuario;

@Entity
@Table(name = "TPedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private LocalDateTime data;
	private boolean web;
	@OneToOne(cascade = CascadeType.DETACH) 
	@JoinColumn(name = "idSolicitante")
	private Solicitante solicitante;
	@ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	private List<Produto> produtos;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	public Pedido() {
		descricao = "Pedido inicial";
		data = LocalDateTime.now();
		web = true;
	}

	public Pedido(String descricao, Solicitante solicitante, List<Produto> produtos, Usuario usuario) {
		this();
		this.descricao = descricao;
		this.solicitante = solicitante;
		this.produtos = produtos;
		this.usuario = usuario;
	}
	
	@Override
	public String toString() {
		return descricao + ";" + data + ";" + web + ";" + solicitante + ";" + produtos.size();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}

	public Solicitante getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}