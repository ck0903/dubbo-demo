package com.hzgc.dubbo.demoprovider;

import com.hzgc.dubbo.demoapi.DemoService;

import java.io.Serializable;

public class DemoServiceImpl implements DemoService,Serializable{


    public String sayHello(String name) {
        return "Hello " + name;
    }
}
