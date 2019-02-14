package com.epam.beanpostprocessor;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.epam.beanpostprocessor")
public class MyConfig {

    @Bean(name = "third")
    //@Qualifier("third")
    public Cat instanceCat()
    {
        Cat cat = new Cat();
        cat.setName("third kisa");
        return cat;
    }



}
