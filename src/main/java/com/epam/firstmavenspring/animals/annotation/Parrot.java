package com.epam.firstmavenspring.animals.annotation;

import org.springframework.stereotype.Component;

@Component("parrot-kesha") // we can set bean's name, by default - lower case class name
public class Parrot {

    private String name = "parrot";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
