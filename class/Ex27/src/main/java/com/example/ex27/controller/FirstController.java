package com.example.ex27.controller;

import com.example.ex27.service.MVCService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
@RequiredArgsConstructor
public class FirstController {
    private final MVCService service;

    @GetMapping("/get-cnt")
    public String getCnt(Model md) {
        service.getCount(md);

        return "mvc/result1";
    }

    @GetMapping("/get-enam")
    public String getEname(Model md) {
        service.getEname(md);

        return "mvc/result2";
    }

    @GetMapping("/get-item1")
    public String getItem1(Model md) {
        service.getItem1(md);

        return "mvc/result3";
    }

    @GetMapping("/get-item2")
    public String getItem2(Model md) {
        service.getItem2(md);

        return "mvc/result4";
    }

    @GetMapping("/get-item3")
    public String getItem3(Model md) {
        service.getItem3(md);

        return "mvc/result5";
    }
}
