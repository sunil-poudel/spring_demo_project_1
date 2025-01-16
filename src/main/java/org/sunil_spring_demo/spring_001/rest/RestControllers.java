package org.sunil_spring_demo.spring_001.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {

    @GetMapping("/")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/about-me")
    public String about(){
        return "My name is Sunil Poudel. I am from Puranchaur!";
    }
}
