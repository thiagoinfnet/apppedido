package br.edu.infnet.apppedido.calcado;

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
public class CalcadoController {
	
	@Autowired
	private CalcadoService calcadoService;

	@GetMapping(value = "/calcado/lista")
	public String telaLista(Model model, HttpSession session) {
		Usuario usuario = (Usuario) session.getAttribute("user");
		
        if (usuario == null) {
            return "redirect:/login";
        }
        
		model.addAttribute("listaCalcados", calcadoService.obterLista(usuario));
		
		return "calcado/lista";
	}

	@GetMapping(value = "/calcado/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		calcadoService.excluir(id);

		return "redirect:/calcado/lista";
	}
}	