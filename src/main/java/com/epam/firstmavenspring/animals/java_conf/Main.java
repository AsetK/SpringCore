package com.epam.firstmavenspring.animals.java_conf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Cat cat = context.getBean(Cat.class);
        //Dog dog = (Dog)context.getBean("getDog");
        //Parrot parrot = context.getBean("parrot-kesha",Parrot.class);
        System.out.println("Main: " + cat.getFirstDog().getName());
        //System.out.println(dog.getParrot().getName());
    }
}
