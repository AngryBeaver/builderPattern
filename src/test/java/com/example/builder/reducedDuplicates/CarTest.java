package com.example.builder.reducedDuplicates;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void reducedBuilderPattern() throws Exception {
        Car car = Car.builder()
                .color("red")
                .gears(3)
                .power(100)
                .torque(10)
                .build();
        assertEquals("red",car.getColor());
    }



}