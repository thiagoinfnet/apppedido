package br.edu.infnet.apppedido.solicitante;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitanteRepository extends CrudRepository<Solicitante, Integer>{
	
	@Query("from Solicitante s where s.usuario.id = :userid")
	public List<Solicitante> obterLista(Integer userid);
}
