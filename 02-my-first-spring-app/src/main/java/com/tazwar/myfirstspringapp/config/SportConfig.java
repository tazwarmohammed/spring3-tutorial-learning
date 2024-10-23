package com.tazwar.myfirstspringapp.config;

import com.tazwar.myfirstspringapp.component.Coach;
import com.tazwar.myfirstspringapp.component.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("swimmerBean")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
