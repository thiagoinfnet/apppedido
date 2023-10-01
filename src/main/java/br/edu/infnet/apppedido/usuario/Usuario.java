package br.edu.infnet.apppedido.usuario;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.edu.infnet.apppedido.pedido.Pedido;
import br.edu.infnet.apppedido.produto.Produto;
import br.edu.infnet.apppedido.solicitante.Solicitante;

@Entity
@Table(name = "TUsuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String senha;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Solicitante> solicitantes;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Produto> produtos;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Pedido> pedidos;
	
	public Usuario() {
		
	}
	
	public Usuario(Integer id) {
		this.id = id;
	}
	
	public Usuario(String nome, String email, String senha) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Solicitante> getSolicitantes() {
		return solicitantes;
	}

	public void setSolicitantes(List<Solicitante> solicitantes) {
		this.solicitantes = solicitantes;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Solicitante> getSolicitante() {
		return solicitantes;
	}

	public void setSolicitante(List<Solicitante> solicitante) {
		this.solicitantes = solicitante;
	}
}
