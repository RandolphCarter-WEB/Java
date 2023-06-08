package com.example.ex20.dto;

public enum Region {
    BUSAN("부산"), JEJU("제주"), SEOUL("서울");
    private final String desc;

    Region(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}