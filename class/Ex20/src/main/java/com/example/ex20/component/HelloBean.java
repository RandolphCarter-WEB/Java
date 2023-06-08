package com.example.ex20.component;

import org.springframework.stereotype.Component;

@Component("helloBean")
public class HelloBean {
    public String hello(String data) {
        return "hello >> " + data;
    }
}
