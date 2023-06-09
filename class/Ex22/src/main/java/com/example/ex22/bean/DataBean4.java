package com.example.ex22.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
@Getter
public class DataBean4 {
    private String data1 = "test1";
    private String data2 = "test2";
}
