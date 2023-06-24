package com.example.ex27.controller;

import com.example.ex27.dto.EmpDTO;
import com.example.ex27.dto.EmpDTO1;
import com.example.ex27.service.MVCService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/param")
@RequiredArgsConstructor
public class SecondController {
    private final MVCService service;

    @GetMapping("/param-input")
    public String inputParam() {
        return "param/input";
    }

    @GetMapping("/param-input1")
    public String inputParam(Model md, EmpDTO1 dto) {
        md.addAttribute("dto", dto);
        return "param/input1";
    }

    @GetMapping("/get-param1")
    public String getParam1(Model md, @RequestParam("id") int id) {
        service.getItemParam1(md, id);

        return "param/result1";
    }

    @GetMapping("/get-param2")
    public String getParam2(Model md, @RequestParam("deptno") int deptno, @RequestParam("job") String job) {
        service.getItemParam2(md, deptno, job);

        return "param/result2";
    }

    @GetMapping("/get-param3")
    public String getParam3(Model md, EmpDTO1 dto) {
        service.getItemParam3(md, dto);

        return "param/result3";
    }
}