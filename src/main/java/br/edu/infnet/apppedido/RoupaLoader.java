package br.edu.infnet.apppedido;

import br.edu.infnet.apppedido.model.domain.Roupa;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(3)
@Component
public class RoupaLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Roupa roupa = new Roupa("Biquini", 50.00F, 540650, "Feminino", "Banho", "P");

        System.out.println("Inclusão de roupa realizada com sucesso! " + roupa);
    }
}