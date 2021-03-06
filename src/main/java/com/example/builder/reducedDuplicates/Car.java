package com.example.builder.reducedDuplicates;

/**
 * pros: immutable
 * pros: fluent interface idiom
 * pros: reduced duplicate fields
 * cons: still massive class
 * cons: brainfucked
 */
public final class Car {

    private int power;
    private int torque;
    private int gears;
    private String color;

    public static Builder builder() {
        return new Car().builder;
    }

    private Builder builder;

    private Car() {
        builder = new Builder(this);
    }

    public class Builder {

        private Builder(Car car) {
            this.car = car;
        }

        private Car car;

        public Car build() {
            return car;
        }

        public Builder power(int value) {
            power = value;
            return this;
        }

        public Builder torque(int value) {
            torque = value;
            return this;
        }

        public Builder gears(int value) {
            gears = value;
            return this;
        }

        public Builder color(String value) {
            color = value;
            return this;
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
