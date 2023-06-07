package com.neusoft.controller;

import com.neusoft.entity.Dept;
import com.neusoft.entity.Emp;
import com.neusoft.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("dept")
public class DeptController {
    @Autowired
    private IDeptService iDeptService;

}
