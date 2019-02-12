package com.epam.beanpostprocessor;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.epam.beanpostprocessor");
        Cat cat = context.getBean(Cat.class);
        System.out.println(cat);



    }
}
