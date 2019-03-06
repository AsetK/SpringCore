package com.epam.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class CatValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Cat.class.equals(aClass) ;
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"name", "name.empty");

        Cat cat = (Cat)o;
        if(cat.getAge() < 0)
            errors.rejectValue("age", "negative value");

    }
}
