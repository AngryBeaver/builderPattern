package com.example.builder.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void beanPattern() throws Exception {
        Car car = new Car();
        car.setColor("red");
        car.setGears(3);
        car.setPower(100);
        car.setTorque(10);
        assertEquals("red",car.getColor());
    }


}