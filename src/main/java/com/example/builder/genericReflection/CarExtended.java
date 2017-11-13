package com.example.builder.genericReflection;


/**
 * pros: ? fluent interface idiom
 * pros: no setter
 * cons: no typesavty
 * cons: no defined keys
 * cons: mutable
 */
public final class CarExtended extends GenericPojo<CarExtended>{

    private int power;
    private int torque;
    private int gears;
    private String color;

    public CarExtended(){
        super();
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


