package com.company.entity;

import javax.persistence.Embeddable;

@Embeddable
public class ContactInfo {
    private String name;
    private String lastName;
    private int age;
}
