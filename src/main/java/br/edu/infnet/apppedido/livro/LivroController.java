package br.edu.infnet.apppedido.livro;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.apppedido.usuario.Usuario;

@SessionAttributes("user")
@Controller
public class LivroController {
	
	@Autowired
	private LivroService livroService;

	@GetMapping(value = "/livro/lista")
	public String telaLista(Model model, HttpSession session) {
		Usuario usuario = (Usuario) session.getAttribute("user");
		
        if (usuario == null) {
            return "redirect:/login";
        }
        
		model.addAttribute("listaLivros", livroService.obterLista(usuario));
		
		return "livro/lista";
	}

	@GetMapping(value = "/livro/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		livroService.excluir(id);

		return "redirect:/livro/lista";
	}
}	