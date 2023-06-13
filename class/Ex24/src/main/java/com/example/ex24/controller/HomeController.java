package com.example.ex24.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/api/v1/hello")
    public String helloApi() {
        return "Hello, User!";
    }
}