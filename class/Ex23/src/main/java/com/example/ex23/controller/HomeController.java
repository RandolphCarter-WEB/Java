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

    @GetMapping("/test-page2")
    public String getPage2() {
        return "rest1/page2";
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

    @PutMapping("/users2")
    @ResponseBody
    public ResponseEntity<Map<String, String>> test3(@RequestBody Map<String, Object> map) {
        for (Map.Entry<String, Object> stringObjectEntry : map.entrySet()) {
            System.out.println(stringObjectEntry);
        }

        Map<String, String> result = new HashMap<>();
        result.put("destiny", "GOD game");
        result.put("chicken", "GOD food");

        return new ResponseEntity<>(result , HttpStatus.OK);
    }

    @PatchMapping("/users3")
    @ResponseBody
    public ResponseEntity<List<Map<String, String>>> test4(@RequestBody Map<String, Object> map) {

        for (Map.Entry<String, Object> stringObjectEntry : map.entrySet()) {
            System.out.println(stringObjectEntry);
        }

        Map<String, String> result1 = new HashMap<>();
        result1.put("destiny", "GOD game");
        result1.put("chicken", "GOD food");

        Map<String, String> result2 = new HashMap<>();
        result2.put("destiny", "Trash game");
        result2.put("pizza", "GOD food");

        Map<String, String> result3 = new HashMap<>();
        result3.put("maple", "Not game");
        result3.put("str", "aaa");

        List<Map<String, String>> list = new ArrayList<>();
        list.add(result1);
        list.add(result2);
        list.add(result3);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @DeleteMapping("/users4")
    @ResponseBody
    public ResponseEntity<List<Map<String, String>>> test5(@RequestBody List<Map<String, Object>> list) {

        for (Map<String, Object> map : list) {
            System.out.println(map);
        }

        Map<String, String> result1 = new HashMap<>();
        result1.put("destiny", "GOD game");
        result1.put("chicken", "GOD food");

        Map<String, String> result2 = new HashMap<>();
        result2.put("destiny", "Trash game");
        result2.put("pizza", "GOD food");

        Map<String, String> result3 = new HashMap<>();
        result3.put("maple", "Not game");
        result3.put("str", "aaa");

        List<Map<String, String>> result = new ArrayList<>();
        result.add(result1);
        result.add(result2);
        result.add(result3);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }


}
