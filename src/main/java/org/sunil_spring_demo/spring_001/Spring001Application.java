package org.sunil_spring_demo.spring_001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"org.sunil_spring_demo.spring_001, com.spring_core"})
@SpringBootApplication
public class Spring001Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring001Application.class, args);
    }

}
