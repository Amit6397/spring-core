package com.sunglowsys.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("employee.cfg.xml");
        Employee emp1 = (Employee) context.getBean("emp1");
        Employee emp2 = (Employee) context.getBean("emp2");
        System.out.println(emp2);
        System.out.println(emp1);
    }
}
