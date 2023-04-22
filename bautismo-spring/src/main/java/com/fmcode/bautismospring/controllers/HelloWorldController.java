package com.fmcode.bautismospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/greetings/{username}")
    public String greetings(@PathVariable String username){
        return "Hello World from Spring Boot " + username;
    }

    @GetMapping("/add/{numberOne}/{numberTwo}")
    public int add(@PathVariable int numberOne, @PathVariable int numberTwo){
        return numberOne + numberTwo;
    }
}
