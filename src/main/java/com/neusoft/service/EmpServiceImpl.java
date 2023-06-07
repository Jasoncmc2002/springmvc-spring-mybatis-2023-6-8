package com.neusoft.service;

import com.neusoft.dao.IEmpDao;
import com.neusoft.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements IEmpService{
    @Autowired
   private IEmpDao iEmpDao;
    @Override
    public Emp queryEmpById(int id) {
        return iEmpDao.getEmpById(id);
    }

    @Override
    public List<Emp> queryEmpList() {
        return iEmpDao.getEmpList();
    }

    @Override
    public void addEmpService(Emp emp) {
        iEmpDao.addEmp(emp);
    }

    @Override
    public List<Emp> queryEmpByName(String name) {
        return iEmpDao.getEmpByName(name);
    }

    @Override
    public void modifyEmpService(Emp emp) {
        iEmpDao.modifyEmp(emp);
    }

    @Override
    public void deleteEmpService(Emp emp) {
     iEmpDao.deleteEmp(emp);
    }

}
