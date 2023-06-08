package com.example.ex21.Assembler;

import com.example.ex21.service.IMemberService;
import com.example.ex21.service.IMemberServiceImpl;

public class IAssembler {
    IMemberService service;

    public IAssembler() {
        this.service = new IMemberServiceImpl();
    }
    public IMemberService getService() {
        return service;
    }
}
