package br.edu.infnet.apppedido.pedido;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Integer> {

	@Query("from Pedido p where p.usuario.id = :userid")
	public List<Pedido> obterLista(Integer userid);
}