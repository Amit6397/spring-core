package com.sunglowsys.firstSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("firstspring.cfg.xml");
        Student student1 = (Student) context.getBean("student1") ;
        Student student2 = (Student) context.getBean("student2");

        System.out.println(student1);
        System.out.println(student2);

    }

}
