package com.example.builder.genericReflection;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void genericReflection() throws Exception {
        Car car = new Car()
                .with("color","red")
                .with("gears",3)
                .with("power",100)
                .with("torque",10);
        assertEquals("red",car.getColor());
    }

}