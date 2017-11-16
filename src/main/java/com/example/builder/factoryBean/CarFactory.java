package com.example.builder.factoryBean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean<Car> {

    private int power;
    private int torque;
    private int gears;
    private String color;

    @Override
    public Car getObject() throws Exception {
        return new Car(power, torque, gears, color);
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
