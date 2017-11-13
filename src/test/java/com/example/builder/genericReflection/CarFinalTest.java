package com.example.builder.genericReflection;

import static com.example.builder.genericReflection.CarFinal.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarFinalTest {
    @Test
    public void genericReflection() throws Exception {
        CarFinal car = new CarFinal()
                .with(color).value("red")
                .with(gears).value(3)
                .with(power).value(100)
                .with(torque).value(10);
        assertEquals("red",car.get(color));
    }

}