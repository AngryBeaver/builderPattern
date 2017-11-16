package com.example.builder.factoryBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedCarFactory {

    @Bean(name = "carFactory")
    public CarFactory redCarFactory() {
        CarFactory factory = new CarFactory();
        factory.setColor("red");
        factory.setGears(3);
        factory.setPower(100);
        factory.setTorque(10);
        return factory;
    }

    @Bean
    public Car car() throws Exception {
        return redCarFactory().getObject();
    }
}
