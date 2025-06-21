package com.codewithsahil.store.controllers;

import com.codewithsahil.store.entities.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

//    @RequestMapping("/hello")
//    public String sayHello(){
//        return "Hello World!!";
//    }

    @RequestMapping("/hello")
    public Message sayHello(){
        return new Message("Hello World!!");
    }
}
