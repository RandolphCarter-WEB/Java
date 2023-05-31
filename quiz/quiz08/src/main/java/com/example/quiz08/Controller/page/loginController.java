package com.example.quiz08.Controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class loginController {
    @PostMapping("/login")
public String Login(WebRequest req) {
        String userID = req.getParameter("id");
        String userPW = req.getParameter("pw");

        assert userID != null;
        if(userID.equals("tmd3587")) {
            assert userPW != null;
            if(userPW.equals("123")) {
                req.setAttribute("userID", userID, WebRequest.SCOPE_SESSION);
                req.setAttribute("userPW", userPW, WebRequest.SCOPE_SESSION);

                req.setAttribute("userName", "OST", WebRequest.SCOPE_SESSION);
                req.setAttribute("userAge", 30, WebRequest.SCOPE_SESSION);
                req.setAttribute("userEmail", "tmd3587@daum.net", WebRequest.SCOPE_SESSION);

                return "register/registerPage";
            } else {
                System.out.println("[SYSTEM ERROR] Password incorrect");
            }
        } else {
            System.out.println("[SYSTEM ERROR] ID incorrect");
        }

        return "redirect:/login";
    }
}
