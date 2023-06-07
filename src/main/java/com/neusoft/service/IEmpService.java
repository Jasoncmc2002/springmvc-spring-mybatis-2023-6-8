package com.neusoft.service;

import com.neusoft.entity.Emp;

import java.util.List;


public interface IEmpService {
    Emp queryEmpById(int id);
    List<Emp> queryEmpList();
    void addEmpService(Emp emp);
    List<Emp> queryEmpByName(String name);
    void modifyEmpService(Emp emp);
    void deleteEmpService(Emp emp);
}
