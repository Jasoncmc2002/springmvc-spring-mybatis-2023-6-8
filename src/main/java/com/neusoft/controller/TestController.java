package com.neusoft.controller;

import com.neusoft.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    private ITestService iTestService;

    //无法直接打印字符串，必须借助jsp页面
    @RequestMapping("test1")
    public ModelAndView test(ModelAndView mv){
        String word= iTestService.test();
        mv.addObject("word",word);
        mv.setViewName("test");
        return mv;
    }

}
