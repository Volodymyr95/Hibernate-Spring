package com.company.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BankService {

    @Autowired
    private PaymentSystem paymentSystem;

    public BankService() {
        System.out.println("BankService bean created");
    }

    @PostConstruct
    public void init() {
        paymentSystem.setupData();
    }

    @PreDestroy
    public void close() {
        System.out.println("END!");
    }
}
