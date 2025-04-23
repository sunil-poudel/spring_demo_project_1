package com.spring_core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalRestController {
    private Dog dog;

    @Autowired
    public AnimalRestController(Dog dog){
        this.dog = dog;
    }

    @GetMapping("/dogSound")
    public String productSound(){
        return dog.produceSound();
    }
}
