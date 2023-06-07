package com.neusoft.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements ITestService{

    @Override
    public String test() {
        return "Test Method!";
    }
}
