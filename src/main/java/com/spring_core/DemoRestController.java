package com.spring_core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    //define private field for the dependency
    private Coach myCoach;

    //define constructor for dependency injection
    @Autowired
    public DemoRestController(Coach coach){
        myCoach = coach;
    }

    //create mapping
    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
