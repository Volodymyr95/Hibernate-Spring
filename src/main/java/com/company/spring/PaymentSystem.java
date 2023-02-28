package com.company.spring;

import org.springframework.stereotype.Component;

@Component
public class PaymentSystem {

    public PaymentSystem() {
        System.out.println("PaymentSystem bean created");
    }

    public void setupData() {
        System.out.println("Data into DB");
    }
}
