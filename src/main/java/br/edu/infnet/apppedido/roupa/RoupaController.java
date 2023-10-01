package br.edu.infnet.apppedido.roupa;

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
public class RoupaController {
	
	@Autowired
	private RoupaService roupaService;

	@GetMapping(value = "/roupa/lista")
	public String telaLista(Model model, HttpSession session) {
		Usuario usuario = (Usuario) session.getAttribute("user");
		
        if (usuario == null) {
            return "redirect:/login";
        }
        
		model.addAttribute("listaRoupas", roupaService.obterLista(usuario));
		
		return "roupa/lista";
	}

	@GetMapping(value = "/roupa/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		roupaService.excluir(id);

		return "redirect:/roupa/lista";
	}
}	