package com.company.spring;

import org.springframework.stereotype.Component;

public class Car {

    private String name;
    private int year;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
        System.out.println("2 argument");
    }


    public Car(String name) {
        this.name = name;
        System.out.println("1 argument");
    }


    public void start() {
        System.out.println("Car Started!");
    }
}
