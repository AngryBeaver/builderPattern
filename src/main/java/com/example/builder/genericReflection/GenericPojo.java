package com.example.builder.genericReflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public abstract class GenericPojo<T> {

    protected static Map<String,Field> Properties = new HashMap<>();

    public GenericPojo(){
        Field[] allFields = getCurrentClass().getDeclaredFields();
        for (Field field : allFields) {
            if (Modifier.isPrivate(field.getModifiers())) {
                field.setAccessible(true);
                Properties.put(field.getName(),field);
            }
        }
    }

    private <E extends GenericPojo> Class<E> getCurrentClass(){
        String name = Thread.currentThread().getStackTrace()[3].getClassName();
        try{
            return (Class<E>) Class.forName(name);
        }catch(Exception e){
            //TODO
        }
        return null;
    }

    public T with(String key,Object value) {
        try {
            Properties.get(key).set(this, value);
        }catch(Exception e){
            //TODO
        }
        return (T) this;
    }
}
