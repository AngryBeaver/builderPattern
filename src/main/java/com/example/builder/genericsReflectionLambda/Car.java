package com.example.builder.genericsReflectionLambda;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/**
 * Dietmar Code
 *
 * pros: ? fluent interface idiom
 * cons: no typesavty
 * cons: no defined keys
 * cons: ugly code
 * cons: mutable
 */
public final class Car {

    private int power;
    private int torque;
    private int gears;
    private String color;

    private static Map<String,Field> Properties = new HashMap<>();

    {
        Field[] allFields = Car.class.getDeclaredFields();
        for (Field field : allFields) {
            if (Modifier.isPrivate(field.getModifiers())) {
                field.setAccessible(true);
                Properties.put(field.getName(),field);
            }
        }
    }

    //problems
    // type savety
    // illegal argument exception ?
    public <Object> Car with(String key,Object value) {
        try {
            Car.Properties.get(key).set(this, value);
        }catch(Exception e){
            e.getMessage();
        }
        return this;
    }

    public int getPower() {
        return power;
    }

    public int getTorque() {
        return torque;
    }

    public int getGears() {
        return gears;
    }

    public String getColor() {
        return color;
    }

}

