package com.company.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.company.spring")
public class Config {


    @Bean
    public Car car1() {
        return new Car("BMW");
    }

    @Bean
    public Car car2() {
        return new Car("Audi",2012);
    }
}
