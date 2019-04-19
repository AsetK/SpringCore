package com.epam.beanpostprocessor;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Primary
public class Cat implements InitializingBean {

    String name = "first kisa";

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

    @PostConstruct
    public void init()
    {
        System.out.println("PostConstruct: " + this);
    }

    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("afterPropertiesSet: " + this);
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("PreDestroy: " + this);
    }

    @Bean(name = "second")
    //@Qualifier("second")
    public Cat instanceCat()
    {
        Cat cat = new Cat();
        cat.setName("second kisa");
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
