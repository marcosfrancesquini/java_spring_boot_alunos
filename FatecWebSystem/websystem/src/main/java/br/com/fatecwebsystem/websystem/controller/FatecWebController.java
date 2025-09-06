package br.com.fatecwebsystem.websystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller // sabe que e controlador
@RequestMapping("/fatecweb") //Rota cria mapeamento para controladora determinou o nome da controlador, mapeado-a /Rota
public class FatecWebController {

    @GetMapping
    public String index(Model model) {
        //Retorna a página index.html
        return "/index";
    }
        
}
