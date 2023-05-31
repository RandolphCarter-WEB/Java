package com.example.quiz08.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HomeController {
    @GetMapping ("/")
    public String Home() {
        return "index";
    }

    @GetMapping ("/login")
    public String Login() {
        return "/login/loginPage";
    }

    @GetMapping("/register")
    public String Register(WebRequest req) {
        String userName = req.getParameter("userName");

        return "/register/registerPage";
    }

    @GetMapping("/result")
    public String Result(WebRequest req) {
        String userName = req.getParameter("userName");
        String userAge = req.getParameter("userAge");
        String userID = req.getParameter("userID");
        String userPW = req.getParameter("userPW");
        String userEmail = req.getParameter("userEmail");
        String userClassName = req.getParameter("userClassName");
        String userClassTime = req.getParameter("userClassTime");

        return "result/result";
    }
}
