package com.example.springmvcdemo;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private String name;
    private Address adress;

    public Customer(String name, Address adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }
}
