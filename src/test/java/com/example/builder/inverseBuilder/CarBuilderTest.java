package com.example.builder.inverseBuilder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarBuilderTest {

    @Test
    public void inverseBuilder() throws Exception {
        CarBuilder.Car car = new CarBuilder()
                .setColor("red")
                .setGears(3)
                .setPower(100)
                .setTorque(10)
                .build();
        assertEquals("red", car.getColor());
    }
}