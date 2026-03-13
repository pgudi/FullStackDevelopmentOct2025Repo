package com.gentech.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ContentController {

    @GetMapping("/home")
    public String getHomePage(){
        return "It has displayed Home Page of the Application!";
    }

    @GetMapping("/home/user")
    public String getUserHomePage(){
        return "It has displayed User Home Page of the Application!";
    }

    @GetMapping("/home/admin")
    public String getAdminHomePage(){
        return "It has displayed Admin Home Page of the Application!";
    }
}
