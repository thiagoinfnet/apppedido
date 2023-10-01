package br.edu.infnet.apppedido;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.roupa.Roupa;
import br.edu.infnet.apppedido.roupa.RoupaService;
import br.edu.infnet.apppedido.usuario.Usuario;

@Order(5)
@Component
public class RoupaLoader implements ApplicationRunner {

	@Autowired
	private RoupaService roupaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		FileReader file = new FileReader("arquivos/roupa.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		
		String[] campos = null;
		
		while(linha != null) {
			campos = linha.split(";"); 

			Roupa roupa = new Roupa(
					campos[0], 
					Float.valueOf(campos[1]), 
					Integer.valueOf(campos[2]), 
					campos[3], 
					campos[4], 
					campos[5]
				);	
			
			roupa.setUsuario(new Usuario(Integer.valueOf(campos[6])));

			roupaService.incluir(roupa);
			
			linha = leitura.readLine();
		}

		leitura.close();		
	}
}