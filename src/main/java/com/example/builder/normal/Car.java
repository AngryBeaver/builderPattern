package com.example.builder.normal;

/**
 * http://minborgsjavapot.blogspot.de/2014/08/creating-objects-using-builder-pattern.html
 * http://www.vogella.com/tutorials/DesignPatternBuilder/article.html
 * pros: immutable
 * pros: fluent interface idiom
 * cons: massive class
 */
public class Car {

    private final int power;
    private final int torque;
    private final int gears;
    private final String color;

    private Car(Builder builder) {
        this.power = builder.power;
        this.torque = builder.torque;
        this.gears = builder.gears;
        this.color = builder.color;
    }

    public static class Builder {

        private int power;
        private int torque;
        private int gears;
        private String color;

        public Builder power(int power) {
            this.power = power;
            return this;
        }

        public Builder torque(int torque) {
            this.torque = torque;
            return this;
        }

        public Builder gears(int gears) {
            this.gears = gears;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

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
