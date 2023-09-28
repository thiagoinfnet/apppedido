package br.edu.infnet.apppedido;

import br.edu.infnet.apppedido.model.domain.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Order(5)
@Component
public class PedidoLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Solicitante solicitante = new Solicitante("John Doe", "000.000.000-00", "john@doe.com");

		List<Produto> listaProdutos = new ArrayList<>();

		listaProdutos.add(new Eletronico("Laptop Nitro", 5000.00F, 564131, "Windows", "Acer", 2.0F));
		listaProdutos.add(new Livro("Maps of Meaning", 100.00F, 32465, "Psicologia", "Jordan B. Peterson", "Routledge"));
		listaProdutos.add(new Roupa("Biquini", 50.00F, 540650, "Feminino", "Banho", "P"));

		Pedido pedido = new Pedido("Pedido 1", solicitante, listaProdutos);
		
		System.out.println("Inclusão do pedido realizada com sucesso!" + pedido);
		
	}

}
