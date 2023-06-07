package com.neusoft.controller;

import com.neusoft.entity.Emp;
import com.neusoft.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("emp")
public class EmpController {
    @Autowired
    private IEmpService iEmpService;
    @RequestMapping("get")
    public ModelAndView test(ModelAndView mv){
        Emp emp = iEmpService.queryEmpById(23);
        mv.addObject("emp",emp);
        mv.setViewName("test");
        return mv;
    }
}
