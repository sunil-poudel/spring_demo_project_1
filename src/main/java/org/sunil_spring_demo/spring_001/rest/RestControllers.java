package org.sunil_spring_demo.spring_001.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {

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
}
