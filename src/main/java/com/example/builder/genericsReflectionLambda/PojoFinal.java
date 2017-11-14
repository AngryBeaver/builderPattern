package com.example.builder.genericsReflectionLambda;

import org.springframework.core.ResolvableType;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public abstract class PojoFinal<C extends PojoFinal> {

    private Map<Property,Object> data = new HashMap<>();

    public static void initialize(){
        Field[] allFields = getCurrentClass().getDeclaredFields();
        for (Field field : allFields) {
            if (Modifier.isStatic(field.getModifiers())) {
                ResolvableType resolvableType = ResolvableType.forField(field);
                Class<?> type = resolvableType.getGeneric(1).resolve();
                Property property = new Property(getCurrentClass(),type,field.getName());
                try {
                    field.set(getCurrentClass(), property);
                }catch(Exception e){
                    //TODO
                }
            }
        }
    }

    private static Class<?> getCurrentClass(){
        String name = Thread.currentThread().getStackTrace()[3].getClassName();
        try{
            return Class.forName(name);
        }catch(Exception e){
            //TODO
        }
        return null;
    }
    public <T> T get(Property<C,T> property){
        return (T) data.get(property);
    }

    public <T> Value<T,C> with(Property<C,T> property) {
        return value->{
            data.put(property,(T) value);
            return (C) this;
        };
    }
    interface Value<T,C> {
        C value(T value);
    }


}
