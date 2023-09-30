package br.edu.infnet.apppedido.solicitante;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppedido.usuario.Usuario;

@Service
public class SolicitanteService {
	
	@Autowired
	private SolicitanteRepository solicitanteRepository;

	public Collection<Solicitante> obterLista(){
		
		return (Collection<Solicitante>) solicitanteRepository.findAll();
	}
	
	public Collection<Solicitante> obterLista(Usuario usuario){
		
		return (Collection<Solicitante>) solicitanteRepository.obterLista(usuario.getId());
	}

	public void incluir(Solicitante solicitante) {

		solicitanteRepository.save(solicitante);
	}
	
	public void excluir(Integer id) {

		solicitanteRepository.deleteById(id);
	}	
}
