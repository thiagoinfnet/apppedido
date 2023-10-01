package br.edu.infnet.apppedido;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.calcado.Calcado;
import br.edu.infnet.apppedido.calcado.CalcadoService;
import br.edu.infnet.apppedido.usuario.Usuario;

@Order(3)
@Component
public class CalcadoLoader implements ApplicationRunner {

	@Autowired
	private CalcadoService calcadoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		FileReader file = new FileReader("arquivos/calcado.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		
		String[] campos = null;
		
		while(linha != null) {
			campos = linha.split(";"); 

			Calcado calcado = new Calcado(
					campos[0], 
					Float.valueOf(campos[1]), 
					Integer.valueOf(campos[2]), 
					Integer.valueOf(campos[3]), 
					campos[4], 
					campos[5]
				);
			
			calcado.setUsuario(new Usuario(Integer.valueOf(campos[6])));

			calcadoService.incluir(calcado);
			
			linha = leitura.readLine();
		}

		leitura.close();		
	}
}