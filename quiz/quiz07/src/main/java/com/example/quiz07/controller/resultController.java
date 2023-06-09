package com.example.quiz07.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class resultController {
    @RequestMapping(value ="/registration", method = RequestMethod.GET)
    public String home(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");

        return "registration";
    }
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String className = req.getParameter("className");
        String classTime = req.getParameter("classTime");

        if (!className.equals("default")) {
            req.setAttribute("userClass", className);
            req.setAttribute("userClassTime", classTime);

            return "result";
        } else {
            return "registration";
        }
    }
    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String result() {
        return "result";
    }
}
