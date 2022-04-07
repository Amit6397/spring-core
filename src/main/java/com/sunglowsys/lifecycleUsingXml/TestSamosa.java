package com.sunglowsys.lifecycleUsingXml;

import com.sunglowsys.lifecycleUsingXml.lifecycleUsingInterface.Pepsi;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSamosa {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleUsing.cfg.xml");
        Samosa samosa = (Samosa) context.getBean("s1");
        System.out.println(samosa);
        context.registerShutdownHook();


        System.out.println("+++++++++++++++++");
        Pepsi p1 = (Pepsi) context.getBean("p2");
        System.out.println(p1);


    }



}
