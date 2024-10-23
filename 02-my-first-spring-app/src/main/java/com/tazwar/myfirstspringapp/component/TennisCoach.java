package com.tazwar.myfirstspringapp.component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

//    @PostConstruct
//    public void doMyStartupStuff() {
//        System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
//    }
//
//    @PreDestroy
//    public void doMyCleanupStuff() {
//        System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice tennis for 15 minutes";
    }
}
