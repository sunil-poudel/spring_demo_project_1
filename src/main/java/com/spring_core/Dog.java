package com.spring_core;

import org.springframework.context.annotation.Primary;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{
    @Override
    public String produceSound() {
        return "Barks";
    }
}

@Component
//@Primary
class Cat implements Animal{

    @Override
    public String produceSound() {
        return "Purrs";
    }
}

@Component
@Primary
class Sparrow implements Animal{

    @Override
    public String produceSound() {
        return "Chirp";
    }
}
