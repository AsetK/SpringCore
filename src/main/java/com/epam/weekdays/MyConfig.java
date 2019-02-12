package com.epam.weekdays;

import org.springframework.context.annotation.Bean;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class MyConfig {

    @Bean
    public WeekDay getDay()
    {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        switch (dayOfWeek)
        {
            case MONDAY: return new Monday();
            case TUESDAY: return new Tuesday();
            case WEDNESDAY: return new Wednesday();
            case THURSDAY: return new Thursday();
            case FRIDAY: return new Friday();
            case SATURDAY: return new Saturday();
            default: return new Sunday();

        }
    }
}
