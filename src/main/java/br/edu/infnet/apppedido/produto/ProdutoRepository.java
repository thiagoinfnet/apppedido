package br.edu.infnet.apppedido.produto;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
	
	@Query("from Produto p where p.usuario.id = :userid")
	public List<Produto> obterLista(Integer userid);
}
