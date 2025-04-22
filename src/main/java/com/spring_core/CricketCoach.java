package com.spring_core;

import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.stereotype.Component;

//marks class as spring bean, makes it available for
//dependency injection
@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice bowling for 10 minutes daily!";
    }
}
