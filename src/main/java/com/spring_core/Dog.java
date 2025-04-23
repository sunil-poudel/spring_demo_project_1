package com.spring_core;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{
    @Override
    public String produceSound() {
        return "Bark";
    }
}
