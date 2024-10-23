package com.tazwar.myfirstspringapp.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    public FootballCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice football for 15 minutes";
    }
}
