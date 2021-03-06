package com.epam.beanconfiguration.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // or @Named, or @ManagedBean
public class Cat {

    private String name;
    //@Autowired
    //@Resource
    private Dog dogg;

    public Cat(Dog dogg, @Value("kisa") String name)
    {
        //this.dog = dogg;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

//    @Autowired
    public void setName(@Value("kisa2") String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dogg;
    }

    @Autowired  // or @Inject or @Resource
    public void setDog(Dog dogg)
    {
        this.dogg = dogg;
    }
}
