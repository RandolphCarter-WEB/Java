package com.example.quiz06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.rmi.server.ServerCloneException;
import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class HomeController {
    @RequestMapping(value = "/HomeController", method = RequestMethod.POST)
    public String printUserInfo(HttpServletRequest req, HttpServletResponse resp) throws ServerCloneException, UnsupportedEncodingException {
        System.out.println("[UserInfoPrint] System Load");

        req.setCharacterEncoding("UTF-8");
        String education = req.getParameter("education");
        String username = req.getParameter("userName");
        String userEmail = req.getParameter("userEmail");
        String password = req.getParameter("password");
        String department = req.getParameter("department");
        String gender = req.getParameter("gender");
        String[] interest = req.getParameterValues("interest");

        System.out.println("[SYSTEM] " + education + " education");
        System.out.println("[SYSTEM] UserName >> " + username);
        System.out.println("[SYSTEM] UserEmail >> " + userEmail);
        System.out.println("[SYSTEM] Password >> " + password);
        System.out.println("[SYSTEM] User Department >> " + department);
        System.out.println("[SYSTEM] gender >> " + gender);
        System.out.print("[SYSTEM] interest >> " + Arrays.toString(interest));

        return "index";
    }
}
