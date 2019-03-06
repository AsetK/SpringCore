package com.epam.validation;

import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.FieldError;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(-1);

        CatValidator catValidator = new CatValidator();
        BeanPropertyBindingResult result = new BeanPropertyBindingResult(cat,"myCat");

        catValidator.validate(cat,result);

        List<FieldError> errors = result.getFieldErrors();
        for(FieldError error: errors) {
            System.out.println(error.getField() + " - " +error.getCode() + ", " + error.getRejectedValue() + ", " + error.getObjectName());
        }

    }
}
