package com.example.react2.api;

import com.example.react2.dto.UserDTO1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/front2")
public class Front2Controller {

    @GetMapping("/listdata")
    public List<UserDTO1> listData(){
        return List.of(
                new UserDTO1(10, "가가가",30),
                new UserDTO1(11, "나나나",31),
                new UserDTO1(12, "다다다",32));
    }
}
