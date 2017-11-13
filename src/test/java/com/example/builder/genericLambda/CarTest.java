package com.example.builder.genericLambda;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void genericLambda() throws Exception {
        Car car = new Car.Builder()
                .with($->{
                    $.color = "red";
                    $.gears = 3;
                    $.power = 100;
                    $.torque = 10;
                }).build();
        assertEquals("red",car.getColor());
    }

}