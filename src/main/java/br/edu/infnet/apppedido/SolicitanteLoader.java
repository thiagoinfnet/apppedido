package br.edu.infnet.apppedido;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.solicitante.Solicitante;

@Order(4)
@Component
public class SolicitanteLoader implements ApplicationRunner {
	
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Solicitante solicitante = new Solicitante("John Doe", "000.000.000-00", "john@doe.com");

        System.out.println("Inclusão do solicitante realizada com sucesso!" + solicitante);

    }
}