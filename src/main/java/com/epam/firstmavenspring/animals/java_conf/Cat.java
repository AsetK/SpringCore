package com.epam.firstmavenspring.animals.java_conf;


import org.springframework.beans.factory.annotation.Autowired;

public class Cat {

    private String name = "cat";
    //@Autowired
    private Dog dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getFirstDog() {
        return dog;
    }

    @Autowired
    public void setFirstDog(Dog dog)
    {
        this.dog = dog;
    }
}
