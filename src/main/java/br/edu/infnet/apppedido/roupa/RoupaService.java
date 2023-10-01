package br.edu.infnet.apppedido.roupa;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppedido.usuario.Usuario;

@Service
public class RoupaService {
	
	@Autowired
	private RoupaRepository roupaRepository;

	public Collection<Roupa> obterLista(){
		
		return (Collection<Roupa>) roupaRepository.findAll();
	}
	
	public Collection<Roupa> obterLista(Usuario usuario){
		
		return (Collection<Roupa>) roupaRepository.obterLista(usuario.getId());
	}

	public void incluir(Roupa roupa) {

		roupaRepository.save(roupa);
	}
	
	public void excluir(Integer id) {

		roupaRepository.deleteById(id);
	}
}