package com.example.ex21;

import com.example.ex21.Assembler.Assembler;
import com.example.ex21.Assembler.IAssembler;
import com.example.ex21.service.IMemberService;
import com.example.ex21.service.MemberService;

public class NonDIApplication {
    public static void main(String[] args) {
        Assembler assembler = new Assembler();
        MemberService service1 = assembler.getService1();
        service1.saveMember();


        IAssembler assembler2 = new IAssembler();
        IMemberService service2 = assembler2.getService();
        service2.saveMember();
    }
}
