package com.example.FirstApp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.lang.model.element.NestingKind;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello () {
        return "Hello, World!";
    }

    @RequestMapping("workout")
     public String dailyWorkout(){
        return "Run a hard 5 km";
     }
     @RequestMapping("/fortune")
     public String dailyFortune(){
        return "Today is my lucky day";
     }
}
