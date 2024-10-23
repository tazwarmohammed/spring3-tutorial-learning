package com.tazwar.myfirstspringapp.controller;

import com.tazwar.myfirstspringapp.component.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Coach coach;
    private final Coach anotherCoach;

    @Autowired
    public DemoController(@Qualifier("swimmerBean") Coach coach,
                          @Qualifier("swimmerBean") Coach anotherCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        this.coach = coach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myCoach == anotherCoach, " + (coach == anotherCoach);
    }
}
