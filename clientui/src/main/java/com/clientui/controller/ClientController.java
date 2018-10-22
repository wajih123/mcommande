package com.clientui.controller;

import com.clientui.beans.ProductBean;
import com.clientui.proxies.MicroserviceProduitsProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClientController {

    @Autowired
    private MicroserviceProduitsProxy produitsProxy;

    @RequestMapping("/")
    public String acceuil(Model model){
        List<ProductBean> produits = produitsProxy.listedesProduits();
        model.addAttribute("produits",produits);

        return"Acceuil";

    }

    @GetMapping("/details-produit/{id}")
    public String ficheProduit(@PathVariable int id, Model model)
    {
        ProductBean produit = produitsProxy.recupererUnProduit(id);
        model.addAttribute("produit",produit);
        return "FicheProduit";

    }
}
