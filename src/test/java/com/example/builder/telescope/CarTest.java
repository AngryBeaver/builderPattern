package com.example.builder.telescope;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {


    @Test
    public void telescopePattern() throws Exception {
        Car car = new Car("red",3,100,10);
        assertEquals("red",car.getColor());
    }
}