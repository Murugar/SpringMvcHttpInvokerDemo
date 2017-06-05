package com.iqmsoft.spring.httpinvoker.impl;

import com.iqmsoft.spring.httpinvoker.interfaces.SimpleService;


public class SimpleServiceImpl implements SimpleService {

    public SimpleServiceImpl() {
    }

   
    public String sayHelloTo(String name) {
        return "Hello: " + name;
    }
    
    public String sayWelcomeTo(String name) {
        return "Welcome: " + name;
    }
}
