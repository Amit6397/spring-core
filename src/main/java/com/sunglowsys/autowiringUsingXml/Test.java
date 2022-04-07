package com.sunglowsys.autowiringUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiringUsing.cfg.xml");
        Emp e = context.getBean("e",Emp.class);
        System.out.println(e);
    }
}
