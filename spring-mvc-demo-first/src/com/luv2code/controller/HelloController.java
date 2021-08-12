package com.luv2code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HelloController {

    @RequestMapping("/homePage")
    public String homeTest(){
        return "home-page";
    }
}
