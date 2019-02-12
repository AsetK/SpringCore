package com.epam.beanpostprocessor;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Cat implements InitializingBean {

    String name = "kisa";

//    public Cat (@Value("kisa") String catName)
//    {
//        name = catName;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @PostConstruct
    public void init()
    {
        System.out.println("PostConstruct: " + this);
    }

    @Override
    public void afterPropertiesSet() throws Exception
    {
        this.setName("new kisa");
        System.out.println("afterPropertiesSet: " + this);
    }
}
