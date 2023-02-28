package com.company.entity;

import javax.persistence.Entity;

@Entity
public class Developer extends Employee {

    private double salary;

    public Developer(String name, double salary) {
        super(name);
        this.salary = salary;
    }
}
