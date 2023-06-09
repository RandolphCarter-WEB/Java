package com.example.ex22.bean;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Component
public class DataBean2 {
    @Getter
    private String data1 = "test1";

    @Setter
    private String data2;

    @Getter(AccessLevel.PROTECTED)
    private String data3;
}
