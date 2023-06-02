package com.example.ex19.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example02")
public class Example02Controller {
    @PostMapping("/test01")
    public String getUser() {

    }
}
