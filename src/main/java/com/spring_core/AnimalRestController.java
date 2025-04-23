package com.spring_core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalRestController {
    //field injection, directly on field, not recommended
//    @Autowired
//    private Animal animal;
    private Animal animal;

//    //constructor injection
//    @Autowired
//    public AnimalRestController(Dog dog) {
//        this.dog = dog;
//    }

    @Autowired
    public AnimalRestController(@Qualifier("sparrow") Animal animal) {
        this.animal = animal;
    }


    //setter injection
//    @Autowired
//    public void setAnimalRestController(Dog dog){
//        this.dog = dog;
//    }

    @GetMapping("/animalSound")
    public String animalSound(){
        return animal.produceSound();
    }
}
