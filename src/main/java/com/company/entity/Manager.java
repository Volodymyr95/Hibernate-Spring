package com.company.entity;

import javax.persistence.Entity;

@Entity
public class Manager extends Employee {
    private String team;

    public Manager(String name, String team) {
        super(name);
        this.team = team;
    }
}
