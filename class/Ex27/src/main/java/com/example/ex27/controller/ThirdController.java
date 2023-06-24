package com.example.ex27.controller;

import com.example.ex27.dto.EmpDTO1;
import com.example.ex27.service.MVCService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dynamic")
@RequiredArgsConstructor
public class ThirdController {
    private final MVCService service;

    @GetMapping("/input1")
    public String input1(Model md, EmpDTO1 dto) {
        md.addAttribute("dto", dto);
        return "dynamic/input1";
    }

    @GetMapping("/get-dynamic1")
    public String getDynamic1(Model md, EmpDTO1 dto) {
        service.getItemParam4(md, dto);
        return "dynamic/result1";
    }
}
