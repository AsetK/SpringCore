package com.epam.AOP;

import org.springframework.stereotype.Component;

@Component
public class SomeEntity implements SomeInterface{


    @Override
    public int getValue()
    {
        System.out.println("do smth");
        return 10;
    }
}
