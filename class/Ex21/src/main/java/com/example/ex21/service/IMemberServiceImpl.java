package com.example.ex21.service;

import org.springframework.stereotype.Component;

@Component("service2")
public class IMemberServiceImpl implements IMemberService {
    private int num = 0;
    @Override
    public void saveMember() {
        System.out.println("[SYSTEM] successfully save MemberData");
    }

    @Override
    public void plusNum() {
        this.num += 1;
    }

    @Override
    public int getNum() {
        return num;
    }
}
