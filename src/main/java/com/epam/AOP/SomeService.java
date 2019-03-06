package com.epam.AOP;

import org.springframework.stereotype.Component;

@Component
public class SomeService {

    @ShowTime
    public int getValue()
    {
        System.out.println("target method");
        return 5;
    }
}
