package com.hzgc.dubbo.demoprovider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DemoProvideMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"META-INF/spring/dubbo-demo-provider.xml"});
        context.start();

        System.in.read(); // 按任意键退出
//        com.alibaba.dubbo.container.Main.main(args);
    }
}
