package com.yash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/hello")
    public String init(){
        System.out.println("Hi");
        return "index";
    }
}
