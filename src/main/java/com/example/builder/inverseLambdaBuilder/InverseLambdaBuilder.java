package com.example.builder.inverseLambdaBuilder;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Usage of Lambda
 * pros: fluent interface idiom
 * <p>
 * pros: possiblity to autowire Beans and inject them
 * pros: CarBuilder threadsave
 * cons: mutable
 * cons: not suitable as Builder but for Worker (fire and forget)
 */
public final class InverseLambdaBuilder {

    private int autowiredDependencies;

    public static interface Choose extends Close {
        public Choose withPower(final int power);

        public Choose withTorque(final int torque);

        public Choose withGears(final int gears);

        public Choose withColor(final String color);
    }

    public static interface Close {
        public Car close();
    }


    public void validate(Function<Choose, Close> configuration, Consumer<Car> consumer) {
        Car car = configuration.andThen(Close::close).apply(new Car());
        consumer.accept(car);
    }

    public class Car implements Choose, Close {

        private int power;
        private int torque;
        private int gears;
        private String color;

        private Car() {
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

        @Override
        public Choose withPower(int power) {
            this.power = power;
            return this;
        }

        @Override
        public Choose withGears(int gears) {
            this.gears = gears;
            return this;
        }

        @Override
        public Choose withColor(String color) {
            this.color = color;
            return this;
        }

        @Override
        public Choose withTorque(int torque) {
            this.torque = torque;
            return null;
        }

        @Override
        public Car close() {
            return this;
        }

    }


}
