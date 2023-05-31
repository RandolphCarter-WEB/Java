package com.example.ex19.Controller;

import com.example.ex19.DTO.test5DTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example01")
public class Example01Controller {
//    @GetMapping("/test1")
//    public String test1(test1DTO dto1) {
//
//        System.out.println("data >> " + Arrays.toString(dto1.getData()));
//        return "result";
//    }

    @GetMapping("/test1")
    public String test1() {
        return "example01/test1";
    }

    @PostMapping("/test2")
    public String test2() {
        return "example01/test2";
    }

    @GetMapping("/test3")
    public String test3(Model model) {
        model.addAttribute("data1", 100);
        model.addAttribute("data2", 200);

        return "example01/test3";
    }

    @GetMapping("/test4")
    public ModelAndView test4(ModelAndView mv) {
        mv.setViewName("example01/test4");

        mv.addObject("data1", 100);
        mv.addObject("data2", 200);

        return mv;
    }

    @PostMapping("/test5")
    public String test5(@ModelAttribute("dto") test5DTO dto) {
        return "example01/test5";
    }
}