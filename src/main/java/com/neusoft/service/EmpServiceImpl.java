package com.neusoft.service;

import com.neusoft.dao.IEmpDao;
import com.neusoft.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements IEmpService{
    @Autowired
   private IEmpDao iEmpDao;
    @Override
    public Emp queryEmpById(int id) {
        return iEmpDao.getEmpById(id);
    }
}
