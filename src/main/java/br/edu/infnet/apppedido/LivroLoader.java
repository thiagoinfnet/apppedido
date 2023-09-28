package br.edu.infnet.apppedido;

import br.edu.infnet.apppedido.model.domain.Livro;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class LivroLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Livro livro = new Livro("Maps of Meaning", 100.00F, 32465, "Psicologia", "Jordan B. Peterson", "Routledge");

        System.out.println("Inclusão de livro realizada com sucesso! " + livro);
    }
}