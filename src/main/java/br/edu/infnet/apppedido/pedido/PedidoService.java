package br.edu.infnet.apppedido.pedido;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppedido.usuario.Usuario;

@Service
@Transactional
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;

	public Collection<Pedido> obterLista(){
		
		return (Collection<Pedido>) pedidoRepository.findAll();
	}
	
	public Collection<Pedido> obterLista(Usuario usuario){
		
		return (Collection<Pedido>) pedidoRepository.obterLista(usuario.getId());
	}

	public Pedido incluir(Pedido pedido) {

		return pedidoRepository.save(pedido);
	}
	
	public void excluir(Integer id) {

		pedidoRepository.deleteById(id);
	}	
}