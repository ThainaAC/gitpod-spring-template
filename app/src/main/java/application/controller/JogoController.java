package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import application.model.JogoRepository;

@Controller
@RequestMapping("/jogo")
public class JogoController {
    @Autowired
    private JogoRepository JogoRepo;

    @RequestMapping ("/list")
    public String list (Model model) {
        model.addAttribute("jogos", JogoRepo.findAll());
        return "/jogo/list";   
    }
    @RequestMapping("/insert")
    public String insert() {
        return "/jogo/insert";
    }

    
}
