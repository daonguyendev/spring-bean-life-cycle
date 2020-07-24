package com.daonguyen;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "Beans.xml");

        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.getMessage();
        context.registerShutdownHook();
    }
}
