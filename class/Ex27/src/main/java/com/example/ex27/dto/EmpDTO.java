package com.example.ex27.dto;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("EmpDTO")
public class EmpDTO {
    private Integer empno;
    private String ename;
    private Double sal;
}
