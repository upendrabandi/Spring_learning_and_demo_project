package com.luv2code.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DemoController {
    @GetMapping("/")
    public String showHome(){
        return "home";
    }

    @GetMapping("/display")
    public String show(){
        return "home";
    }
}
