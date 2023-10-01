package br.edu.infnet.apppedido;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

//@Order(6)
//@Component
public class PedidoLoader implements ApplicationRunner {
	
	@Autowired
	private PedidoService pedidoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Map<LocalDateTime, Pedido> mapaPedido = new HashMap<LocalDateTime, Pedido>();
		
		FileReader file = new FileReader("arquivos/pedidoSolicitante.txt");
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

				mapaPedido.put(pedido.getData(), pedido);

				break;

			case "C":				
				pedido.getProdutos().add(new Calcado(Integer.valueOf(campos[1])));
				
				break;

			case "L":
				pedido.getProdutos().add(new Livro(Integer.valueOf(campos[1])));
				
				break;

			case "R":			
				pedido.getProdutos().add(new Roupa(Integer.valueOf(campos[1])));

				break;

			default:
				break;
			}
			
			linha = leitura.readLine();
		}

		for(Pedido p : mapaPedido.values()) {
			pedidoService.incluir(p);
			System.out.println("[Pedido] Inclusão realizada com sucesso: " + p);			
		}
		
		for(Pedido p : pedidoService.obterLista()) {
			System.out.println("[Pedido] Inclusão realizada com sucesso: " + p);			
		}

		leitura.close();			
	}

}