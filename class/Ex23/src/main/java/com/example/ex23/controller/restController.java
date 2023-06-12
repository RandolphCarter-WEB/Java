package com.example.ex23.controller;

import com.example.ex23.dto.UserDTO;
import com.example.ex23.dto.UserDTO1;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rest2")
public class restController {

    @GetMapping("/users1")
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

    @PostMapping("/users2")
    public ResponseEntity<String> test2(@RequestBody Map<String, Object> map) {

        for (Map.Entry<String, Object> stringObjectEntry : map.entrySet()) {
            System.out.println(stringObjectEntry);
        }

        return new ResponseEntity<>("Success send response.", HttpStatus.OK);
    }

    @GetMapping("/users11")
    public ResponseEntity<List<UserDTO>> test11(@RequestParam String name, @RequestParam int age) {
        System.out.println("name >> " + name);
        System.out.println("age >> " + age);

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

    @PutMapping("/users3")
    public ResponseEntity<List<UserDTO>> test3(@RequestBody UserDTO1 dto) {
        System.out.println(dto);

        UserDTO bean1 = new UserDTO("OST", 25, 11.11, false);
        UserDTO bean2 = new UserDTO("KSG", 15, 22.22, true);
        UserDTO bean3 = new UserDTO("PSG", 32, 33.33, false);

        List<UserDTO> list = new ArrayList<>();
        list.add(bean1);
        list.add(bean2);
        list.add(bean3);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PatchMapping("/users4")
    public List<UserDTO> test4(@RequestBody UserDTO1 dto) {
        System.out.println(dto);

        UserDTO bean1 = new UserDTO("OST", 25, 11.11, false);
        UserDTO bean2 = new UserDTO("KSG", 15, 22.22, true);
        UserDTO bean3 = new UserDTO("PSG", 32, 33.33, false);

        List<UserDTO> list = new ArrayList<>();
        list.add(bean1);
        list.add(bean2);
        list.add(bean3);

        return list;
    }

    @DeleteMapping("/users5")
    public ResponseEntity<List<UserDTO>> test5(@RequestBody List<UserDTO1> resp) {

        for(UserDTO1 dto : resp) {
            System.out.println(dto);
        }

        UserDTO bean1 = new UserDTO("OST", 25, 11.11, false);
        UserDTO bean2 = new UserDTO("KSG", 15, 22.22, true);
        UserDTO bean3 = new UserDTO("PSG", 32, 33.33, false);

        List<UserDTO> list = new ArrayList<>();
        list.add(bean1);
        list.add(bean2);
        list.add(bean3);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
