package com.neusoft.service;

import com.neusoft.dao.IDeptDao;
import com.neusoft.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements IDeptService {
    @Autowired
    private IDeptDao iDeptDao;

    @Override
    public List<Dept> queryDeptList() {
        return iDeptDao.getDeptList();
    }
}
