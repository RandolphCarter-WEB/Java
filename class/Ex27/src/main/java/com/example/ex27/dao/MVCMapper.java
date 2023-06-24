package com.example.ex27.dao;

import com.example.ex27.dto.EmpDTO;
import com.example.ex27.dto.EmpDTO1;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface MVCMapper {
    public int getCount();
    public String getEname();
    public Map<String, Object> getItem1();
    public List<Map<String, Object>> getItem2();
    public List<EmpDTO> getItem3();
    public EmpDTO getItemParam1(@Param("empno") int id);
    public EmpDTO getItemParam2(@Param("deptno") int deptno, @Param("job") String job);
    public EmpDTO getItemParam3(EmpDTO1 dto);
    public EmpDTO getItemParam4(EmpDTO1 dto);
}
