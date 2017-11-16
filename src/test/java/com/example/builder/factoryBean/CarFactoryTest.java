package com.example.builder.factoryBean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RedCarFactory.class)
public class CarFactoryTest {
    @Autowired
    private Car car;

    @Resource(name = "&carFactory")
    private CarFactory carFactory;

    public void testCarBean() {
        assertEquals("red", getRedCar().getColor());
    }

    private Car getRedCar() {
        Car redCar = null;
        try {
            redCar = carFactory.getObject();
        } catch (Exception e) {

        }
        return redCar;
    }

    @Test
    public void testFactory() {
        assertEquals("red", getRedCar().getColor());
        assertEquals("red", car.getColor());
        carFactory.setColor("blue");
        assertEquals("red", car.getColor());
        assertEquals("blue", getRedCar().getColor());
    }
}



