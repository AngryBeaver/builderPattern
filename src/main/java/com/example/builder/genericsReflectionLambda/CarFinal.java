package com.example.builder.genericsReflectionLambda;


/**
 * pros: fluent interface idiom
 * pros: minimalistic
 * cons: mutable
 * cons: wtf ???
 */
public final class CarFinal extends PojoFinal<CarFinal>{

    static {
        initialize();
    }

    public static Property<CarFinal, Integer> power;
    public static Property<CarFinal, Integer> torque;
    public static Property<CarFinal, Integer> gears;
    public static Property<CarFinal, String> color;

}


