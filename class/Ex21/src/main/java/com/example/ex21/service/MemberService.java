package com.example.ex21.service;

import org.springframework.stereotype.Component;

@Component("service1")
public class MemberService {
    public void saveMember() {
        System.out.println("[SYSTEM] success to save Member.");
    }
}
