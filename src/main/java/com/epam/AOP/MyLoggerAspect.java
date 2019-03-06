package com.epam.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggerAspect {

//    @Pointcut("execution(* *(..)) && within(com.epam.AOP.SomeService)")
    @Pointcut("execution(* com.epam.AOP.SomeInterface.*(..))") //needless if we use @annotation as pointcut
    public void allMethods()
    {}

//    @Before("allMethods()")
    @Before("@annotation(com.epam.AOP.ShowTime) || allMethods()")
    public void init()
    {
        System.out.println("before");
    }

//    @After("allMethods()")
    @After("@annotation(com.epam.AOP.ShowTime)")
    public void close()
    {
        System.out.println("after");
    }

//    @AfterReturning(pointcut = "allMethods()", returning = "object")
    @AfterReturning(pointcut = "@annotation(com.epam.AOP.ShowTime)", returning = "object")
    public void printValue(Object object)
    {
        System.out.println("AfterReturning: " + object);
    }



//    @Around("allMethods()")
    @Around("@annotation(com.epam.AOP.ShowTime)")
    public Object countMethodExecutionTime(ProceedingJoinPoint joinPoint)
    {
        System.out.println("Around: start");
        long start = System.currentTimeMillis();
        Object output = null;

        try
        {
            output = joinPoint.proceed(); //next advice or target method. We need return output object because target method returns value
            System.out.println("Output value: " + output);
        }
        catch (Throwable throwable)
        {
            throwable.printStackTrace();
        }

        long time = System.currentTimeMillis() - start;
        System.out.println("Around: end - Method execution time: " + time);

        return output;
    }
}
