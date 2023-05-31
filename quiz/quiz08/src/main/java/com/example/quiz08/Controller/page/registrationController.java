package com.example.quiz08.Controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class registrationController {
    @PostMapping("/register")
    public String register(WebRequest req) {
        String userClassName = req.getParameter("className");
        String userClassTime = req.getParameter("classTime");

        assert userClassName != null;
        if(!userClassName.equals("default")) {
            req.setAttribute("userName", "OST", WebRequest.SCOPE_REQUEST);
            req.setAttribute("userAge", 30, WebRequest.SCOPE_REQUEST);
            req.setAttribute("userEmail", "tmd3587@daum.net", WebRequest.SCOPE_REQUEST);

            req.setAttribute("userClassName", userClassName, WebRequest.SCOPE_REQUEST);
            req.setAttribute("userClassTime", userClassTime, WebRequest.SCOPE_REQUEST);

            return "/result/result";
        } else {
            System.out.println("[SYSTEM ERROR] Class Name is default");
        }

        return "redirect:/register/registerPage";
    }
}
