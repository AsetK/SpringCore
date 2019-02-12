package com.epam.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof Cat)
        {
            Cat cat = (Cat)bean;
        }
        System.out.println("CustomBeanPostProcessor - before: " + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof Cat)
        {
            Cat cat = (Cat)bean;
        }
        System.out.println("CustomBeanPostProcessor - after: " + bean);
        return bean;
    }

}
