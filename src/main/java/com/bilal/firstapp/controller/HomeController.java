package com.bilal.firstapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/")
    public String sayHelloGet(){
        return "Hello World From Get";
    }

    @PutMapping("/")
    public String sayHelloPut(){
        return "Hello World From Put";
    }

    @PostMapping("/")
    public String sayHelloPost(){
        return "Hello World From Post";
    }

    @DeleteMapping("/")
    public String sayHelloDelete(){
        return "Hello World From Delete";
    }

}
