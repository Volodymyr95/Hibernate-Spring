package com.company.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class Water  extends Product{
    private double price;

    public Water(String name, double price) {
        super(name);
        this.price = price;
    }
}
