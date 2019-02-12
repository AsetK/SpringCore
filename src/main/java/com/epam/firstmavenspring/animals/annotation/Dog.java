package com.epam.firstmavenspring.animals.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Dog {

    private String name = "dog";

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
