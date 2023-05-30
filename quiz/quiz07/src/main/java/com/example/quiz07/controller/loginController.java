package com.example.quiz07.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class loginController {
    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String login() {
        return "index";
    }

    @RequestMapping(value ="/", method = RequestMethod.POST)
    public String login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String id = req.getParameter("id");
        String pw = req.getParameter("pw");

        if(id.equals("tmd3587")) {
            if(pw.equals("123")) {
                req.setAttribute("userID", id);
                req.setAttribute("userPW", pw);
                req.setAttribute("userName", "OST");
                req.setAttribute("userAge", 30);
                req.setAttribute("userEmail", "tmd3587@daum.net");

                return "registration";
            } else {
                return "redirect:/index";
            }
        } else {
            return "redirect:/index";
        }
    }
}
