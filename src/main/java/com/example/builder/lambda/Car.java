package com.example.builder.lambda;

import java.util.function.Function;

/**
 * https://jaxenter.de/pattern-java-8-lambda-43323
 * pros: immutable
 * pros: fluent interface idiom
 * cons: massive class
 * cons: neither of both worlds
 */
public class Car {

    private final int power;
    private final int torque;
    private final int gears;
    private final String color;

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

    private Car(Builder builder) {
        this.power = builder.power;
        this.torque = builder.torque;
        this.gears = builder.gears;
        this.color = builder.color;
    }

    public static Car make(Function<ChoosePower, Create> configuration) {
        return configuration.andThen(Create::close).apply(new Builder());
    }

    public static interface ChoosePower {
        public ChooseTorque withTorque(final int torque);

        public ChooseGears withGears(final int gears);

        public ChooseColor withColor(final String color);

        public Create create();
    }

    public static interface ChooseTorque {
        public Create create();
    }

    public static interface ChooseGears {
        public ChooseTorque withTorque(final int torque);

        public ChoosePower withPower(final int power);

        public ChooseColor withColor(final String color);

        public Create create();
    }

    public static interface ChooseColor {
        public ChooseTorque withTorque(final int torque);

        public ChooseGears withGears(final int gears);

        public ChoosePower withPower(final int power);

        public Create create();
    }

    public static interface Create {
        public Car close();
    }

    private static class Builder implements ChoosePower, ChooseTorque, ChooseGears, ChooseColor, Create {

        public int power;
        public int torque;
        public int gears;
        public String color;


        @Override
        public ChooseTorque withTorque(int torque) {
            this.torque = torque;
            return this;
        }

        @Override
        public ChoosePower withPower(int power) {
            this.power = power;
            return this;
        }

        @Override
        public ChooseGears withGears(int gears) {
            this.gears = gears;
            return this;
        }

        @Override
        public ChooseColor withColor(String color) {
            this.color = color;
            return this;
        }

        @Override
        public Create create() {
            return this;
        }

        @Override
        public Car close() {
            return new Car(this);
        }
    }
}