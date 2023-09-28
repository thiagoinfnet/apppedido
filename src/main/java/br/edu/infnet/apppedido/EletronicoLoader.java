package br.edu.infnet.apppedido;

import br.edu.infnet.apppedido.model.domain.Eletronico;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

@Order(1)
@Component
public class EletronicoLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Map<Integer, Eletronico> mapaEletronico = new HashMap<Integer, Eletronico>();

        FileReader file = new FileReader("arquivos/eletronico.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();
        String[] campos = null;

        while (linha != null) {
            campos = linha.split(";");
            Eletronico eletronico = new Eletronico(
                    campos[0],
                    Float.parseFloat(campos[1]),
                    Integer.parseInt(campos[2]),
                    campos[3],
                    campos[4],
                    Float.parseFloat(campos[5])
            );

            mapaEletronico.put(eletronico.getCodigo(), eletronico);

            linha = leitura.readLine();
        }
        leitura.close();

        for(Integer k : mapaEletronico.keySet()) {
            System.out.println("Chave " + k);
            System.out.println("[Eletronico] Inclusão realizada com sucesso: " + mapaEletronico.get(k));
        }
    }
}
