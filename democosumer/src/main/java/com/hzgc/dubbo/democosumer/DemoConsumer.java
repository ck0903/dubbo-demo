package com.hzgc.dubbo.democosumer;

import com.hzgc.dubbo.demoapi.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"META-INF/spring/dubbo-demo-consumer.xml"});
        context.start();

        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        System.out.println("nima " + demoService);
        String hello = demoService.sayHello("world"); // 执行远程方法

        System.out.println( hello ); // 显示调用结果
    }
}
