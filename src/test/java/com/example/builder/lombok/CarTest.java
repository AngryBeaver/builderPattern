package com.example.builder.lombok;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    @Test
    public void lombok() throws Exception {
        Car car = new Car();
        car.setGears(3);
        car.setColor("red");
        car.setPower(100);
        car.setTorque(10);
        assertEquals("red",car.getColor());
    }
}