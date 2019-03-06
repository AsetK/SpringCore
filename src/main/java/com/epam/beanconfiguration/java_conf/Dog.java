package com.epam.beanconfiguration.java_conf;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Dog {

    private String name = "dog";
    @Autowired
    @Qualifier("main")
    //@Resource(name="parrot-ne-kesha")
    private Parrot parrot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }
}
