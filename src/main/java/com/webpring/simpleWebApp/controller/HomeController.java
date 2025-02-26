package com.webpring.simpleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @RequestMapping("/")
    public String greet(){
        return "Welcome to Spring Web App";
    }

    @RequestMapping("/about")
    public String about(){
        return "We don't teach, we Educate!!";
    }
}
