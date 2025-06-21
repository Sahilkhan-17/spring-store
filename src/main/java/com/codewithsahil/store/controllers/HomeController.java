package com.codewithsahil.store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// this annotation marks this class as a bean (object manage by spring).
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index (Model model){
        model.addAttribute("name", "Sahil");
        return "index";
    }

//    @RequestMapping("/hello")
//    private String sayHello (){
//        return "index.html";
//    }
}
