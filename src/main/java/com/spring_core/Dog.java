package com.spring_core;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{
    @Override
    public String produceSound() {
        return "Barks";
    }
}

@Component
class Cat implements Animal{

    @Override
    public String produceSound() {
        return "Purrs";
    }
}

@Component
class Sparrow implements Animal{

    @Override
    public String produceSound() {
        return "Chirp";
    }
}
