package com.example.builder.telescope;

/**
 * http://minborgsjavapot.blogspot.de/2014/08/creating-objects-using-builder-pattern.html
 *
 * pros: immutable
 * pros: reduced duplicate code
 * cons: non fluent interface idiom
 * cons: massive class
 * cons: order of properties
 */
public class Car {

    private final int power;
    private final int torque;
    private final int gears;
    private final String color;

    public Car() {
        this(null);
    }

    public Car(String color) {
        this(color, 0);
    }

    public Car(String color, int gears) {
        this(color, gears, 0);
    }

    public Car(String color, int gears, int power) {
        this(color, gears, power, 0);
    }

    public Car(String color, int gears, int power, int torque) {
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
