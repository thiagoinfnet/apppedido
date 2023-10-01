package br.edu.infnet.apppedido.livro;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends CrudRepository<Livro, Integer>{
	
	@Query("from Livro l where l.usuario.id = :userid")
	public List<Livro> obterLista(Integer userid);
}
