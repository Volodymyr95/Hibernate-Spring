package com.company.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;

    @OneToMany(mappedBy = "adress", fetch = FetchType.LAZY)
    public List<User> users;

    public Adress() {
    }

    public Adress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Adress{" +
            "id=" + id +
            ", address='" + address + '\'' +
            ", users=" + users +
            '}';
    }
}
