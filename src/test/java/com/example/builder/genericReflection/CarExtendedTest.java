package com.example.builder.genericReflection;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarExtendedTest {

    @Test
    public void genericReflection() throws Exception {
        CarExtended car = new CarExtended()
                .with("color","red")
                .with("gears",3)
                .with("power",100)
                .with("torque",10);
        assertEquals("red",car.getColor());
    }

}