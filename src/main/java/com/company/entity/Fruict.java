package com.company.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class Fruict extends Product {

    private String color;

    public Fruict(String name, String color) {
        super(name);
        this.color = color;
    }
}
