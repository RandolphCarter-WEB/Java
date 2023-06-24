package com.example.ex27.service;

import com.example.ex27.dao.MVCMapper;
import com.example.ex27.dto.EmpDTO;
import com.example.ex27.dto.EmpDTO1;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
@RequiredArgsConstructor
public class MVCService {
    private final MVCMapper dao;
    public void getCount(Model md) {
        md.addAttribute("cnt", dao.getCount());
    }
    public void getEname(Model md) {
        md.addAttribute("ename", dao.getEname());
    }
    public void getItem1(Model md) {
        md.addAttribute("item1", dao.getItem1());
    }
    public void getItem2(Model md) {
        md.addAttribute("item2", dao.getItem2());
    }
    public void getItem3(Model md) {
        md.addAttribute("item3", dao.getItem3());
    }
    public void getItemParam1(Model md, int id) {
        md.addAttribute("itemParam1", dao.getItemParam1(id));
    }
    public void getItemParam2(Model md, int deptno, String job) {
        md.addAttribute("itemParam2", dao.getItemParam2(deptno, job));
    }
    public void getItemParam3(Model md, EmpDTO1 dto) {
        md.addAttribute("itemParam3", dao.getItemParam3(dto));
    }
    public void getItemParam4(Model md, EmpDTO1 dto) {
        md.addAttribute("itemParam4", dao.getItemParam4(dto));
    }
}
