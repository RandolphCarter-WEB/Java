package com.example.ex23.controller;

import com.example.ex23.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/rest1")
public class HomeController {

    @GetMapping("/test-page1")
    public String getPage1() {
        return "rest1/page1";
    }

    @GetMapping("/users")
    @ResponseBody
    public ResponseEntity<List<UserDTO>> test1() {
        UserDTO bean1 = new UserDTO("OST", 25, 11.11, false);
        UserDTO bean2 = new UserDTO("KSG", 15, 22.22, true);
        UserDTO bean3 = new UserDTO("PSG", 32, 33.33, false);

        List<UserDTO> list = new ArrayList<>();
        list.add(bean1);
        list.add(bean2);
        list.add(bean3);

        ResponseEntity<List<UserDTO>> entity = new ResponseEntity<>(list, HttpStatus.OK);
        return entity;
    }

    @PostMapping("/users1")
    @ResponseBody
    public ResponseEntity<String> test2(@RequestBody Map<String, Object> map) {

        for (Map.Entry<String, Object> stringObjectEntry : map.entrySet()) {
            System.out.println(stringObjectEntry);
        }

        return new ResponseEntity<>("Success send response.", HttpStatus.OK);
    }
}
