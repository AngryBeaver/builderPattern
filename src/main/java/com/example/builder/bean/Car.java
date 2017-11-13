package com.example.builder.bean;

/**
 * http://minborgsjavapot.blogspot.de/2014/08/creating-objects-using-builder-pattern.html
 * pros: minimal setter and getter
 * cons: non fluent interface idiom
 * cons: mutable
 */
public class Car {

    private int power;
    private int torque;
    private int gears;
    private String color;

    public void setPower(int integer) {
        power = integer;
    }
    public void setTorque(int integer) {
        torque = integer;
    }
    public void setGears(int integer) {
        gears = integer;
    }
    public void setColor(String string) {
        color = string;
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
