package com.example.builder.inverseLambdaBuilder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InverseLambdaBuilderTest {

    @Test
    public void inverseBuilder() throws Exception {
        new InverseLambdaBuilder()
                .validate(cfg -> cfg
                                .withColor("red")
                                .withGears(3)
                                .withPower(100)
                                .withTorque(10),
                        car -> {
                            assertEquals("red", car.getColor());
                        }
                );
    }

}