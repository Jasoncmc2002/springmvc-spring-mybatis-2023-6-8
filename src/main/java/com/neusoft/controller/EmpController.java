package com.neusoft.controller;

import com.neusoft.entity.Dept;
import com.neusoft.entity.Emp;
import com.neusoft.service.IDeptService;
import com.neusoft.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("emp")
public class EmpController {
    @Autowired
    private IEmpService iEmpService;
    @Autowired
    private IDeptService iDeptService;
   // @RequestMapping("query")
    //RestFul风格：对于参数没有问号只有斜杆，这种更加常见
    @RequestMapping("query/{id}")
    public ModelAndView test(@PathVariable("id") int id, ModelAndView mv){
        Emp emp = iEmpService.queryEmpById(id);
        mv.addObject("emp",emp);
        mv.setViewName("test");
        return mv;
    }
    @RequestMapping("queryList")
    public ModelAndView test2(ModelAndView mv){
        List<Emp> list = iEmpService.queryEmpList();
        mv.addObject("empList",list);
        mv.setViewName("list");
        return mv;
    }
    @RequestMapping("dept")
    public ModelAndView test3(ModelAndView mv){
        List<Dept> list =iDeptService.queryDeptList();
        mv.addObject("deptList",list);
        mv.setViewName("add");
        return mv;
    }
//    @RequestMapping("addEmp")
//    public String test4(Emp emp){
//        iEmpService.addEmpService(emp);
//        return "redirect:/emp/queryList";
//    }
   @RequestMapping("addEmp")
   @ResponseBody
    public int test4(Emp emp){
        int code =0;
        if(iEmpService.queryEmpByName(emp.getEname()).isEmpty()){
            iEmpService.addEmpService(emp);
            code=1;
        }
       return code;
}
    @RequestMapping("modifyEmp")
    @ResponseBody
    public int test5(Emp emp){
        int code =0;
        if(iEmpService.queryEmpById(emp.getId())!=null){
            iEmpService.modifyEmpService(emp);
            code=1;
        }
        return code;
    }
    @RequestMapping("deleteEmp")
    @ResponseBody
    public int test6(Emp emp){
        int code =0;
        if(iEmpService.queryEmpById(emp.getId())!=null){
            iEmpService.deleteEmpService(emp);
            code=1;
        }
        return code;
    }

}
