package org.sunil_spring_demo.spring_001.lazy_initialization;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CityConfig {
    @Bean("janaki")
    public City janakpur(){
        return new Janakpur();
    }
}
