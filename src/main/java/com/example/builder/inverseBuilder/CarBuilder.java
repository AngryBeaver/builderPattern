package com.example.builder.inverseBuilder;

/**
 * Usage of MethodChaining
 * pros: immutable
 * pros: fluent interface idiom
 * <p>
 * pros: possiblity to autowire Beans and inject them
 * cons: CarBuilder not threadsave
 */
public final class CarBuilder {

    private int power;
    private int torque;
    private int gears;
    private String color;

    public Car build() {
        return new Car(this);
    }

    public CarBuilder setPower(int power) {
        this.power = power;
        return this;
    }

    public CarBuilder setTorque(int torque) {
        this.torque = torque;
        return this;
    }

    public CarBuilder setGears(int gears) {
        this.gears = gears;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public class Car {

        private final int power;
        private final int torque;
        private final int gears;
        private final String color;

        private Car(CarBuilder carBuilder) {
            this.power = carBuilder.power;
            this.torque = carBuilder.torque;
            this.gears = carBuilder.gears;
            this.color = carBuilder.color;
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


}
