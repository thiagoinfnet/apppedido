package br.edu.infnet.apppedido.livro;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppedido.usuario.Usuario;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository livroRepository;

	public Collection<Livro> obterLista(){
		
		return (Collection<Livro>) livroRepository.findAll();
	}
	
	public Collection<Livro> obterLista(Usuario usuario){
		
		return (Collection<Livro>) livroRepository.obterLista(usuario.getId());
	}

	public void incluir(Livro livro) {

		livroRepository.save(livro);
	}
	
	public void excluir(Integer id) {

		livroRepository.deleteById(id);
	}
}