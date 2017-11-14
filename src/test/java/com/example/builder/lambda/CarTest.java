package com.example.builder.lambda;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void lambda() throws Exception {
        Car car = Car.make(cfg -> cfg
                .withColor("red")
                .withGears(3)
                .withPower(100)
                .withTorque(3)
                .create()
        );
        assertEquals("red", car.getColor());
    }

}