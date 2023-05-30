package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(value="/", method= RequestMethod.GET)
    public String home() {
        return "index";
    }

    @RequestMapping(value="/example01", method=RequestMethod.GET)
    public String example01() {
        return "example01/index";
    }

    @GetMapping("/example02")
    public String index() {
        return "example02/index";
    }
}