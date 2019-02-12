package com.epam.weekdays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        WeekDay weekDay = context.getBean(WeekDay.class);
        System.out.println(weekDay.getWeekDayName());

    }
}
