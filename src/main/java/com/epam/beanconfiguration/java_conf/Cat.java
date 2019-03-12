package com.epam.beanconfiguration.java_conf;


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
    public void setFirstDog(Dog dog) // Injects by type. If multiple beans - try to find by field name(field autowiring) or method parameter name(method autowiring). If no matches - exc.
    {
        this.dog = dog;
    }
}
