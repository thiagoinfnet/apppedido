package br.edu.infnet.apppedido;

import br.edu.infnet.apppedido.model.domain.Solicitante;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Order(6)
@Component
public class MapLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Solicitante s1 = new Solicitante("maria", "111", "maria@maria.com");
        Solicitante s2 = new Solicitante("jose", "123", "jose@jose.com");
        Solicitante s3 = new Solicitante("aninha", "234", "ana@ana.com");

        Map<String, Solicitante> mapa = new HashMap<String, Solicitante>();
        mapa.put("111", s1);
        mapa.put("123", s2);
        mapa.put("234", s3);

        for (String k : mapa.keySet()) {
            System.out.println("key: " + k);
        }

        for (Solicitante v : mapa.values()) {
            System.out.println("values: " + v.getNome());
        }

        System.out.println("keyset: " + mapa.keySet());
        System.out.println("values: " + mapa.values());
        System.out.println("get: " + mapa.get("111"));
        System.out.println("get: " + mapa.get("123"));
        System.out.println("get: " + mapa.get("234"));

        mapa.remove("234");
        System.out.println("get: " + mapa.get("234"));
    }
}
