package com.example.ex24.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class CorsController {
    @GetMapping("/non-cors")
    public String nonCors() {
        System.out.println("[SYSTEM] nonCors func load.");
        return "not cors";
    }

    @CrossOrigin("http://localhost:3000")
    @GetMapping("/cors")
    public String cors() {
        System.out.println("[SYSTEM] Cors func load.");
        return "cors";
    }

    @GetMapping("/non-proxy")
    public String nonProxy() {
        System.out.println("[SYSTEM] nonProxy func load.");
        return "not proxy";
    }

    @GetMapping("/proxy")
    public String Proxy() {
        System.out.println("[SYSTEM] Proxy func load.");
        return "proxy";
    }
}
