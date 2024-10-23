package com.tazwar.myfirstspringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages = {"com.tazwar.myfirstspringapp", "util"})
@SpringBootApplication
public class MyFirstSpringAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFirstSpringAppApplication.class, args);
    }

}
