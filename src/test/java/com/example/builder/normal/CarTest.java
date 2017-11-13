package com.example.builder.normal;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    @Test
    public void builderPattern() throws Exception {
        Car car =  new Car.Builder()
                .color("red")
                .gears(3)
                .power(100)
                .torque(10)
                .build();
        assertEquals("red",car.getColor());
    }
}