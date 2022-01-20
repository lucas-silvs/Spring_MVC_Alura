package br.com.alura.mvc.demo.controller;

import br.com.alura.mvc.demo.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private  pedidoRepository pedidoRepository;
    @GetMapping("/home")
    public String home(Model model){
        Pedido pedido = new Pedido();
       List<Pedido> pedidos = pedidoRepository.findAll();
        model.addAttribute("pedidos", pedidos);

        return "home";
    }

}


