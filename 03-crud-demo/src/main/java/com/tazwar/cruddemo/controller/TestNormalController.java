package com.tazwar.cruddemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestNormalController {

    @GetMapping("/hello")
    public String hello() {
        return "index";
    }
}
