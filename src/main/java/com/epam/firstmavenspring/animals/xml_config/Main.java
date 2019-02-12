package com.epam.firstmavenspring.animals.xml_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/beans.xml");

        Cat cat = context.getBean(Cat.class); //we can use interface too
        Dog dog = (Dog)context.getBean("dog"); //standard name is class name in lower case
        Parrot parrot = context.getBean("parrot", Parrot.class); // if several beans of one class
        System.out.println(cat.getName() +", " + dog.getName() + ", " + parrot.getName());
        System.out.println(cat.getDog().getName());
        System.out.println(dog.getParrot().getName());





    }
}
