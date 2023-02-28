package com.company.entity;

import javax.persistence.*;

@Entity
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String info;

    @OneToOne(mappedBy = "passport")
    private User user;

    public Passport() {
    }

    public Passport(String info) {
        this.info = info;
    }
}
