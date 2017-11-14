package com.example.builder.methodChaining;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void methodChaining() throws Exception {
        Car car =  new Car()
                .setColor("red")
                .setGears(3)
                .setPower(100)
                .setTorque(10);
        assertEquals("red",car.getColor());
    }
}