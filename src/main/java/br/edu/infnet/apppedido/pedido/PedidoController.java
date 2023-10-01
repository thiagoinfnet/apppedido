package br.edu.infnet.apppedido.pedido;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.apppedido.usuario.Usuario;

@Controller
public class PedidoController {
	
	private PedidoService pedidoService;

	@GetMapping(value = "/pedido/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaPedido", pedidoService.obterLista(usuario));
		
		return "pedido/lista";
	}

	@GetMapping(value = "/pedido/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		pedidoService.excluir(id);

		return "redirect:/pedido/lista";
	}
}	