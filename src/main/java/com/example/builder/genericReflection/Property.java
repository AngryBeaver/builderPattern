package com.example.builder.genericReflection;

public class Property<C,T> {

    public String name;
    public Class<T> type;
    public Class<C> ofClass;

    public Property(Class<T> type, Class<C> ofClass,String name){
        this.name = name;
        this.type = type;
        this.ofClass = ofClass;
    }

}
