package br.edu.infnet.apppedido;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.livro.Livro;
import br.edu.infnet.apppedido.livro.LivroService;
import br.edu.infnet.apppedido.usuario.Usuario;

@Order(4)
@Component
public class LivroLoader implements ApplicationRunner {

	@Autowired
	private LivroService livroService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		FileReader file = new FileReader("arquivos/calcado.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		
		String[] campos = null;
		
		while(linha != null) {
			campos = linha.split(";"); 

			Livro livro = new Livro(
					campos[0], 
					Float.valueOf(campos[1]), 
					Integer.valueOf(campos[2]), 
					campos[3], 
					campos[4], 
					campos[5]
				);	
			
			livro.setUsuario(new Usuario(Integer.valueOf(campos[6])));

			livroService.incluir(livro);
			
			linha = leitura.readLine();
		}

		leitura.close();		
	}
}