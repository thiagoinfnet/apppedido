package br.edu.infnet.apppedido.calcado;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalcadoRepository extends CrudRepository<Calcado, Integer>{
	
	@Query("from Calcado c where c.usuario.id = :userid")
	public List<Calcado> obterLista(Integer userid);
}