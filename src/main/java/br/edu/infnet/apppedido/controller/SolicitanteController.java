package br.edu.infnet.apppedido.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.apppedido.model.domain.Solicitante;

@Controller
public class SolicitanteController {

    @GetMapping(value = "solicitante/lista")
    public String telaLista(Model model) {
    	
    	List<Solicitante> solicitantes = new ArrayList<Solicitante>();
    	
    	solicitantes.add(new Solicitante("ze", "123123123123", "ze@ze.com"));
    	solicitantes.add(new Solicitante("maria", "456456456456", "maria@maria.com"));
    	solicitantes.add(new Solicitante("joao", "789789789789", "joao@joao.com"));
    	
    	model.addAttribute("listaSolicitante", solicitantes);
    	
        return "solicitante/lista";
    }
}
