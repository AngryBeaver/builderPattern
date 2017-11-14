package com.example.builder.methodChaining;

/**
 * https://en.wikipedia.org/wiki/Method_chaining
 * pros: minimal setter and getter
 * pros: fluent interface idiom
 * cons: mutable
 * cons: unexpected behaviour
 */
public class Car {

    private int power;
    private int torque;
    private int gears;
    private String color;

    //if it might be withPower or setPower:
    // drawback: withPower sounds like we can only use it at build time
    // drawback: setPower longtime experience is to have no return
    public Car setPower(int integer) {
        power = integer;
        return this;
    }
    public Car setTorque(int integer) {
        torque = integer;
        return this;
    }
    public Car setGears(int integer) {
        gears = integer;
        return this;
    }
    public Car setColor(String string) {
        color = string;
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
