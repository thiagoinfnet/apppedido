package br.edu.infnet.apppedido;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.calcado.Calcado;
import br.edu.infnet.apppedido.livro.Livro;
import br.edu.infnet.apppedido.pedido.Pedido;
import br.edu.infnet.apppedido.pedido.PedidoService;
import br.edu.infnet.apppedido.produto.Produto;
import br.edu.infnet.apppedido.roupa.Roupa;
import br.edu.infnet.apppedido.solicitante.Solicitante;
import br.edu.infnet.apppedido.usuario.Usuario;

@Order(6)
@Component
public class PedidoLoader implements ApplicationRunner {
	
	@Autowired
	private PedidoService pedidoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		FileReader file = new FileReader("arquivos/pedido.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		
		String[] campos = null;
		
		Pedido pedido = null;		
		
		while(linha != null) {
			campos = linha.split(";"); 

			switch (campos[0]) {
			case "P":		
								
				pedido = new Pedido(
						campos[1], 
						new Solicitante(Integer.valueOf(campos[2])),
						new ArrayList<Produto>(),
						new Usuario(1)
					);
				
				pedido = pedidoService.incluir(pedido);

				break;

			case "C":				
				pedido.getProdutos().add(new Calcado(Integer.valueOf(campos[1])));
				pedidoService.incluir(pedido);
				break;

			case "L":
				pedido.getProdutos().add(new Livro(Integer.valueOf(campos[1])));
				pedidoService.incluir(pedido);
				break;

			case "R":			
				pedido.getProdutos().add(new Roupa(Integer.valueOf(campos[1])));
				pedidoService.incluir(pedido);
				break;

			default:
				break;
			}
			
			linha = leitura.readLine();
		}

		for(Pedido p : pedidoService.obterLista()) {
			System.out.println("[Pedido] Inclusão realizada com sucesso: " + p);			
		}

		leitura.close();			
	}

}