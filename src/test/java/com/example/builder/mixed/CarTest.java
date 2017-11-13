package com.example.builder.mixed;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void mixedUp() throws Exception {
        Car car =  new Car()
                .setColor("red")
                .setGears(3)
                .setPower(100)
                .setTorque(10);
        assertEquals("red",car.getColor());
    }
}