package br.edu.infnet.apppedido.app;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.apppedido.usuario.Usuario;

@SessionAttributes("user")
@Controller
public class AppController {

	private Projeto projeto;
	
	public void incluir(Projeto projeto) {
		this.projeto = projeto;
	}

	@GetMapping(value = "/")
	public String telaHome(Model model) {
		return telaSobre(model);
	}
	
	@GetMapping(value = "/login")
	public String telaLogin(HttpSession session) {
    	Usuario usuario = (Usuario) session.getAttribute("user");
    	
        if (usuario != null) {
            return "redirect:/";
        }
		return "login";
	}

	@GetMapping(value = "/logout")
	public String telaLogout(HttpSession session, SessionStatus status) {
		
		status.setComplete();
		
		session.removeAttribute("user");
		
		return "redirect:/";
	}

	@GetMapping(value = "/sobre")
	public String telaSobre(Model model) {
		
		model.addAttribute("projeto", projeto);
		
		return "sobre";
	}
}
