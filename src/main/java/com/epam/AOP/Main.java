package com.epam.AOP;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/context.xml");
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.epam.AOP");
        SomeService service = (SomeService)context.getBean("someService");
        int val = service.getValue();

        SomeInterface someInterface = (SomeInterface) context.getBean("someEntity");
        int val2 = someInterface.getValue();

    }
}
