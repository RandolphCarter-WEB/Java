package com.example.ex27.dto;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("EmpDTO1")
public class EmpDTO1 {
    private int deptno;
    private String job;
}
