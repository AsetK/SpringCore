package com.epam.firstmavenspring.animals.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.epam.firstmavenspring.animals.annotation");

        Cat cat = context.getBean(Cat.class); //we can use interface too
        System.out.println(cat.getName());

        System.out.println(cat.getDog().getName());
        cat.getDog().setName("changeDog");
        System.out.println(cat.getDog().getName());

        Dog dog = (Dog)context.getBean("dog"); //standard name is class name in lower case
        Parrot parrot = context.getBean("parrot-kesha",Parrot.class); // if several beans of one class

    }
}
