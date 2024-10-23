package com.tazwar.myfirstspringapp.component;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice swimming for 15 minutes";
    }
}
