package br.com.alura.mvc.demo.controller;

import br.com.alura.mvc.demo.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")

    public String home(Model model){
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("iPhone 12 Apple 64GB ");
        pedido.setDataEntrega(LocalDate.parse("2022-11-03"));
        pedido.setUrlImagem("https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-13-pro-family-hero?wid=940&hei=1112&fmt=png-alpha&.v=1631220221000");
        pedido.setValorNegociado(new BigDecimal("6000"));
        pedido.setDescricao("Bom dms");
        pedido.setUrlProduto("https://www.americanas.com.br/produto/3591024100?epar=bp_pl_00_go_tel_smartphone_todas_geral_gmv&opn=YSMESP&WT.srch=1&gclid=EAIaIQobChMI8eO6m9u-9QIV6_HjBx1lYAc_EAQYASABEgLIOvD_BwE&cor=BRANCO");

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);

        return "home";
    }
}


