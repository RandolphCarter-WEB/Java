package com.example.ex20.controller;

import com.example.ex20.dto.UserDTO1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/basic")
public class HomeController {
    @GetMapping("/test-basic")
    public String textBasic(Model md) {
        md.addAttribute("data1","hello spring boot!!");
        md.addAttribute("data2","hello <b>spring</b> boot!!!");

        return "basic/01-text-basic";
    }

    @GetMapping("/test-variable")
    public String testVariable(Model md) {
        UserDTO1 userA = new UserDTO1("userA", 10);
        UserDTO1 userB = new UserDTO1("userB", 20);

        List<UserDTO1> users = new ArrayList<>();
        users.add(userA);
        users.add(userB);

        Map<String, UserDTO1> map = new HashMap<>();
        map.put("userA", userA);
        map.put("userB", userB);

        md.addAttribute("user", userA);
        md.addAttribute("users", users);
        md.addAttribute("userMap", map);

        return "basic/02-variable";
    }

    @GetMapping("/test-objects")
    public String testBasicObject() {
        return "basic/03-basic-objects";
    }

    @GetMapping("/test-date")
    public String testDate(Model model) {
        model.addAttribute("LocalDateTime", LocalDateTime.now());

        return "basic/04-date";
    }
}
