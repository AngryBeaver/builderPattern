package com.example.builder.genericLambda;

import java.util.function.Consumer;

/**
 * https://dkbalachandar.wordpress.com/2017/08/31/java-8-builder-pattern-with-consumer-interface/
 *
 * pros: less massive writing for fluent interface
 * pros: immutable
 * cons: less fluent interface idiom
 * cons: neither of both worlds
 */
public class Car {

    private final int power;
    private final int torque;
    private final int gears;
    private final String color;

    public Car(Builder builder) {
        this.power = builder.power;
        this.torque = builder.torque;
        this.gears = builder.gears;
        this.color = builder.color;
    }

    public static class Builder {

        public int power;
        public int torque;
        public int gears;
        public String color;

        public Builder with(Consumer<Builder> consumer) {
            consumer.accept(this);
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