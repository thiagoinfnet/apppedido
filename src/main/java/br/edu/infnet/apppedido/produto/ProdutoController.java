package br.edu.infnet.apppedido.produto;

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
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;

	@GetMapping(value = "/produto/lista")
	public String telaLista(Model model, HttpSession session) {
		Usuario usuario = (Usuario) session.getAttribute("user");
		
        if (usuario == null) {
            return "redirect:/login";
        }

		model.addAttribute("listaProdutos", produtoService.obterLista(usuario));
		
		return "produto/lista";
	}

	@GetMapping(value = "/produto/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		produtoService.excluir(id);

		return "redirect:/produto/lista";
	}
}	