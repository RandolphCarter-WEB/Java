package com.example.demo.controller;

import com.example.demo.dto.DataDTO01;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;
import java.io.IOException;
import java.util.List;
import java.util.Map;

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

    @GetMapping("/test4/{data1}")
    public String test4GET(@PathVariable("data1") int[] dat1) {
        for(int data : dat1) {
            System.out.println("[SYSTEM] data1 List's data >> " + data);
        }

        return "example02/result";
    }

    @GetMapping("/test5")
    public String test5GET(@RequestParam("data1") String data1,
                           @RequestParam(defaultValue = "200") String data2) {
        System.out.println("[SYSTEM] data1 >> " + data1);
        System.out.println("[SYSTEM] data2 >> " + data2);

        return "example02/result";
    }

    @GetMapping("/test6")
    public String test7(@RequestParam Map<String, String> map,
                        @RequestParam List<String> data3) {
        String data1 = map.get("data1");
        String data2 = map.get("data2");
        String data3_data = map.get("data3");

        System.out.println("data1 >> " + data1);
        System.out.println("data2 >> " + data2);
        System.out.println("data3 >> " + data3_data);

        return "example02/result";
    }

    @GetMapping("/test7")
    public String test8(@ModelAttribute DataDTO01 dto) {
        System.out.println("data1 >> " + dto.getData1());
        System.out.println("data2 >> " + dto.getData2());

        return "example02/result";
    }

    @PostMapping("/test9")
    public String test9(@ModelAttribute DataDTO01 dto2,
                        @ModelAttribute DataDTO01 dto3) {
        System.out.println("data1 >> " + dto2.getData1());
        System.out.println("data2 >> " + dto2.getData2());

        return "example02/result";
    }
}
