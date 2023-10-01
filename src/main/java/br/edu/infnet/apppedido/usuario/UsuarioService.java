package br.edu.infnet.apppedido.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

import static br.edu.infnet.apppedido.util.PasswordEncoder.isPasswordCorrect;;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Collection<Usuario> obterLista() {
		System.out.println("Lista de Usuarios: " + usuarioRepository.findAll().toString());
		return (Collection<Usuario>)usuarioRepository.findAll();
	}
	
	
	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}
	
	public Usuario validar(String email, String senha) {
		
		Usuario user = usuarioRepository.findByEmail(email);
		
		if(user != null) {
			if(isPasswordCorrect(senha, user.getSenha())) {
				return user;
			}			
		}
		
		return null;
	}
}
