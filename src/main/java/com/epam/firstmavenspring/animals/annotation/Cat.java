package com.epam.firstmavenspring.animals.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat {

    private String name;
    //@Autowired
    private Dog dog;

    public Cat(Dog dogg, @Value("kisa") String name)
    {
        this.dog = dogg;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Autowired()
    public void setName(@Value("kisa") String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dogg)
    {
        this.dog = dogg;
    }
}
