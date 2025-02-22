package com.webpring.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogiinController {
    
    @RequestMapping("/login")
    public String login(){
        return "Login Page is under construction!!";
    }
}
