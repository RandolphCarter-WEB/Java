package com.example.ex21.Assembler;

import com.example.ex21.service.MemberService;

public class Assembler {
    private MemberService service1;
    public Assembler() { this.service1 = new MemberService(); }
    public MemberService getService1() { return service1; }
}
