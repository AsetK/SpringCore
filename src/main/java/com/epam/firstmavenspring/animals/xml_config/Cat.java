package com.epam.firstmavenspring.animals.xml_config;



public class Cat {

    private String name = "cat";
    private Dog dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog()
    {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    } //injecting by setter

}
