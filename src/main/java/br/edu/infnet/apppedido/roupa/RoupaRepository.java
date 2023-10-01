package br.edu.infnet.apppedido.roupa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoupaRepository extends CrudRepository<Roupa, Integer>{
	
	@Query("from Roupa r where r.usuario.id = :userid")
	public List<Roupa> obterLista(Integer userid);
}
