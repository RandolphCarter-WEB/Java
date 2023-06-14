package com.example.react2.api;

import com.example.react2.dto.UserDTO1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/front1")
public class Front1Controller {

    @GetMapping("/listdata")
    public List<UserDTO1> listData(){
        return List.of(
                new UserDTO1(1, "aaa",10),
                new UserDTO1(2, "bbb",11),
                new UserDTO1(3, "ccc",12));
    }
}
