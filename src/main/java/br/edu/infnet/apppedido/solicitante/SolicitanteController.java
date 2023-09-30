package br.edu.infnet.apppedido.solicitante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.apppedido.usuario.Usuario;

@Controller
public class SolicitanteController {
	
	@Autowired
	private SolicitanteService solicitanteService;
	
    @GetMapping(value = "solicitante/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
    	
    	model.addAttribute("listaSolicitantes", solicitanteService.obterLista(usuario));
    	
    	return "redirect:/";
//        return "solicitante/lista";
    }
    
	@GetMapping(value = "/solicitante/cadastro")
	public String telaCadastro() {

		return "solicitante/cadastro";
	}

	@PostMapping(value = "/solicitante/incluir")
	public String incluir(Solicitante solicitante, @SessionAttribute("user") Usuario usuario) {
		
		solicitante.setUsuario(usuario);
		
		solicitanteService.incluir(solicitante);
		
		return "redirect:/solicitante/lista";
	}
	
	@GetMapping(value = "/solicitante/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		solicitanteService.excluir(id);

		return "redirect:/solicitante/lista";
	}
}
