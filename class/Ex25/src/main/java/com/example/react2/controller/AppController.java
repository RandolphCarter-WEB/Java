package com.example.react2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/frontend1")
    public String frountend1(){
        return "frontend1/index";
    }

    @GetMapping("/frontend2")
    public String frountend2(){
        return "frontend2/index";
    }
}
