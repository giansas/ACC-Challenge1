package com.acc.br.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //inicializa a biblioteca CONTROLLER
public class WebController {

    @Autowired
    private ScoreRepository scoreRepository;

    @GetMapping("/teste")
    public String teste(@RequestParam(name="escolha")String aEscolha, Model model){
        String saida = "empate";
        if(aEscolha.equalsIgnoreCase("Papel")){
            saida = "ganhou";
        }

        if(aEscolha.equalsIgnoreCase("tesoura")){
            saida = "perdeu";
        }

        model.addAttribute("saida", saida);
        model.addAttribute("aEscolha", aEscolha);
        return "resultado";

    }
}
