package com.epam.beanconfiguration.java_conf;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("package address") if we use combined type of configuration. In "package address" we have classes annotated by @Component
public class MyConfig {

    @Bean
    public Cat getCat(@Qualifier("main") Parrot parrot) // spring at first creates parrot bean, then cat bean, cuz cat depends on parrot. Dependency injection
    {
        System.out.println("Cat");
        Cat cat = new Cat();
        cat.setName(parrot.getName() + " killer");
        return cat;
    }


    @Bean
    public Dog dog()
    {
        System.out.println("Dog");
        return new Dog();
    }

    @Bean
    //@Primary
    public Dog secondDog()
    {
        Dog dog = new Dog();
        dog.setName("Rex");
        return dog;
    }

    @Bean("parrot-kesha")
    @Qualifier("main")
    public Parrot getParrot()
    {
        System.out.println("Parrot");
        return new Parrot();
    }

    @Bean("parrot-ne-kesha")
    @Qualifier("notMain")
    public Parrot getParrot2()
    {
        System.out.println("Parrot");
        Parrot parrot = new Parrot();
        parrot.setName("ne kesha");
        return parrot;
    }
}
