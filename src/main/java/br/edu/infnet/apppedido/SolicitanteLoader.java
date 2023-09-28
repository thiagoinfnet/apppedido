package br.edu.infnet.apppedido;

import br.edu.infnet.apppedido.controller.SolicitanteController;
import br.edu.infnet.apppedido.model.domain.Solicitante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(4)
@Component
public class SolicitanteLoader implements ApplicationRunner {
	
	@Autowired
	private SolicitanteController solicitanteController;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Solicitante solicitante = new Solicitante("John Doe", "000.000.000-00", "john@doe.com");

        System.out.println("Inclusão do solicitante realizada com sucesso!" + solicitante);

    }
}