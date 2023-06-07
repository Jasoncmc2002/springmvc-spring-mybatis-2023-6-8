package com.neusoft.dao;

import com.neusoft.entity.Emp;

import java.util.List;

public interface IEmpDao {
    Emp getEmpById(int id);
    List<Emp> getEmpList();
    void addEmp(Emp emp);
    List<Emp> getEmpByName(String name);
    void modifyEmp(Emp emp);
    void deleteEmp(Emp emp);
}
