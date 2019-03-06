package com.epam.beanconfiguration.xml_config;



public class Dog {

    private String name = "dog";
    private Parrot parrot;

    public Dog(Parrot parrot) //injecting by constructor
    {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot()
    {
        return parrot;
    }

}
