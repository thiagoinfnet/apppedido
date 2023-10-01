package br.edu.infnet.apppedido.solicitante;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.apppedido.usuario.Usuario;

@SessionAttributes("user")
@Controller
public class SolicitanteController {
	
	@Autowired
	private SolicitanteService solicitanteService;
	
    @GetMapping(value = "solicitante/lista")
    public String telaLista(Model model, HttpSession session) {
    	Usuario usuario = (Usuario) session.getAttribute("user");
    	
        if (usuario == null) {
            return "redirect:/login";
        }
    	
    	model.addAttribute("listaSolicitantes", solicitanteService.obterLista(usuario));
    	
        return "solicitante/lista";
    }
    
	@GetMapping(value = "/solicitante/cadastro")
	public String telaCadastro(HttpSession session) {
    	Usuario usuario = (Usuario) session.getAttribute("user");
    	
        if (usuario == null) {
            return "redirect:/login";
        }

		return "solicitante/cadastro";
	}

	@PostMapping(value = "/solicitante/incluir")
	public String incluir(Solicitante solicitante, HttpSession session) {
    	Usuario usuario = (Usuario) session.getAttribute("user");
    	
        if (usuario == null) {
            return "redirect:/login";
        }
		
		solicitanteService.incluir(solicitante);
		
		return "redirect:/solicitante/lista";
	}
	
	@GetMapping(value = "/solicitante/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		solicitanteService.excluir(id);

		return "redirect:/solicitante/lista";
	}
}
