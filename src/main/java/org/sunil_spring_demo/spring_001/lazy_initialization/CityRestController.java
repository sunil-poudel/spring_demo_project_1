package org.sunil_spring_demo.spring_001.lazy_initialization;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityRestController{
    private City city;
    private City city1;
    private City city2;

//    @Autowired
//    public CityRestController(@Qualifier("pokhara") City city){
//        this.city = city;
//    }
//    @Autowired
//    public CityRestController(@Qualifier("dharan") City city){
//        this.city = city;
//    }

    @Autowired
    public  CityRestController(
            @Qualifier("kathmandu") City city1,
            @Qualifier("kathmandu") City city2

    ){
        this.city1 = city1;
        this.city2 = city2;
    }

//    @GetMapping("/cityCenter")
//    public String cityCenter(){
//        return city.cityCenter();
//    }
//
//    @GetMapping("/specialFeature")
//    public String specialFeature(){
//        return city.specialFeature();
//    }

    @GetMapping("status")
    public String status(){
        return "Status: "+(city1 == city2);
    }

    @PostConstruct
    public void startUp(){
        System.out.println("Started: "+ getClass().getSimpleName());
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("Cleaned up: "+getClass().getSimpleName());
    }

}

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class Pokhara implements City{

    public Pokhara(){
        System.out.println("Created city "+getClass().getName());
    }
    @Override
    public String cityCenter() {
        return "Chipledhunga";
    }

    @Override
    public String specialFeature() {
        return "Tourism capital";
    }
}

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class Kathmandu implements City{
    public Kathmandu(){
        System.out.println("Created city "+getClass().getName());
    }
    @Override
    public String cityCenter() {
        return "Baneshwar";
    }

    @Override
    public String specialFeature() {
        return "Culturally prestine";
    }
}

@Component
@Lazy
class Dharan implements City{
    public Dharan(){
        System.out.println("Created city "+getClass().getSimpleName());
    }
    @Override
    public String cityCenter() {
        return "Dharan Chowk";
    }

    @Override
    public String specialFeature() {
        return "Green city!";
    }
}
