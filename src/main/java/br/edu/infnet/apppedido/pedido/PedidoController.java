package br.edu.infnet.apppedido.pedido;

import java.util.Collection;

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
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;

	@GetMapping(value = "/pedido/lista")
	public String telaLista(Model model, HttpSession session) {
		Usuario usuario = (Usuario) session.getAttribute("user");
		
        if (usuario == null) {
            return "redirect:/login";
        }
        
        Collection<Pedido> pedidosDoUsuario = pedidoService.obterLista(usuario);
        System.out.println(pedidosDoUsuario.toString());
        
        Collection<Pedido> pedidos = pedidoService.obterLista();
        System.out.println(pedidos.toString());
        
		model.addAttribute("listaPedidos", pedidoService.obterLista(usuario));
		
		return "pedido/lista";
	}

	@GetMapping(value = "/pedido/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		pedidoService.excluir(id);

		return "redirect:/pedido/lista";
	}
}	