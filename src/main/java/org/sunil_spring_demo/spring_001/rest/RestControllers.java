package org.sunil_spring_demo.spring_001.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {

    //means that Spring will look for a property named city.name
    // in the configuration file and inject its value into the cityName field.
    @Value("${city.name}")
    private String cityName;

    @Value("${district.name}")
    private String districtName;

    @GetMapping("/about-pokhara")
    public String aboutPokhara(){
        return "city: "+cityName+", district: "+districtName;
    }

    @GetMapping("/")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/about-me")
    public String about(){
        return "My name is Sunil Poudel. I am from Puranchaur!";
    }

    @GetMapping("/wrc")
    public String aboutWrc(){
        return "WRC is wonderful!";
    }
}
