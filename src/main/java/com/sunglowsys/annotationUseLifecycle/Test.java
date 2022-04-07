package com.sunglowsys.annotationUseLifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext  context = new ClassPathXmlApplicationContext("exampleUsinginLifecycle.cfg.xml") ;
        Example e1 = (Example) context.getBean("e1");
        System.out.println(e1);
    }
}
