package com.example.builder.factoryBean;

/**
 * http://minborgsjavapot.blogspot.de/2014/08/creating-objects-using-builder-pattern.html
 * <p>
 * pros: minimal setter and getter
 * pros: immutable
 * cons: non fluent interface idiom
 */
public class Car {

    private final int power;
    private final int torque;
    private final int gears;
    private final String color;


    Car(int power, int torque, int gears, String color) {
        this.power = power;
        this.torque = torque;
        this.gears = gears;
        this.color = color;
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
