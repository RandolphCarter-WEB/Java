package com.example.ex19.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/example01")
    public String home2() {
        return "example01/index";
    }

    @GetMapping("/result")
    public String result() {
        return "result";
    }
}
