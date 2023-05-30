package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/example02")
public class Example02Controller {
    @GetMapping("/test1")
    public String test1(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] dataGET = new String[5];
        dataGET[0] = req.getParameter("data1");
        dataGET[1] = req.getParameter("data2");
        dataGET[2] = req.getParameter("data4");
        String[] datas = req.getParameterValues("data3");
        dataGET[3] = datas[0];
        dataGET[4] = datas[1];

        for (String key : dataGET) {
            System.out.println("[SYSTEM] DATA KEY >> " + key);
        }

        return "example02/result";
    }

    @GetMapping("/test2")
    public String test2() {
        return "example02/result";
    }

    @PostMapping("/test2")
    public String test2Post(WebRequest req) {
        String[] dataPost1 = new String[2];
        dataPost1[0] = req.getParameter("data1");
        dataPost1[1] = req.getParameter("data2");

        for(String data : dataPost1) {
            System.out.println("[SYSTEM] data Key >> " + data);
        }

        String[] dataPost2 = req.getParameterValues("data3");
        assert dataPost2 != null;
        System.out.print("[SYSTEM] data3 Value >> ");
        for(String data : dataPost2) {
            System.out.print(data + " ");
        }
        System.out.println();

        return "example02/result";
    }

    @GetMapping("/test3/{data1}/{data2}/{data3}")
//    public String test3GET(WebRequest req,
//                           @PathVariable("data1") String data1,
//                           @PathVariable("data2") String data2,
//                           @PathVariable("data3") String data3) {
    public String test3GET(@PathVariable("data1") String data1,
                           @PathVariable("data2") String data2,
                           @PathVariable("data3") String data3) {
        System.out.println("[SYSTEM] data1 >> " + data1);
        System.out.println("[SYSTEM] data2 >> " + data2);
        System.out.println("[SYSTEM] data3 >> " + data3);

        return "example02/result";
    }
}
