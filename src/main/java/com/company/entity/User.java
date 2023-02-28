package com.company.entity;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private double salary;

    private String lastName;

    private int age;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passport_id", referencedColumnName = "id")
    private Passport passport;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Adress adress;

    public User(String firstName, double salary, String lastName, int age, Passport passport, Adress adress) {
        this.firstName = firstName;
        this.salary = salary;
        this.lastName = lastName;
        this.age = age;
        this.passport = passport;
        this.adress = adress;
    }

    public User() {
    }

    public User(Long id, String firstName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.salary = salary;
    }

    public User(String firstName, double salary) {
        this.firstName = firstName;
        this.salary = salary;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Passport getPassport() {
        return passport;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", salary=" + salary +
            ", lastName='" + lastName + '\'' +
            ", age=" + age +
            '}';
    }
}
