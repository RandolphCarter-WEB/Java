package com.example.ex22.bean;

import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString(includeFieldNames = false)
@Component
public class DataBean3 {
    private String data1 = "test1";
    private String data2 = "test2";

    @ToString.Include
    public String getHello() {
        return "hello";
    }
}
