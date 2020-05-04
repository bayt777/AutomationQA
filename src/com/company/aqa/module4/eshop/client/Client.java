package com.company.aqa.module4.eshop.client;

import com.company.aqa.module4.eshop.base.Person;

public class Client extends Person {

    public Client(String name, int age, double cashBalance) {
        this.setName(name);
        this.setAge(age);
        this.setCashBalance(cashBalance);
    }

    @Override
    public void talk() {
        System.out.println("Hello my name is " + getName());
    }

    @Override
    public void walk() {

    }

    @Override
    public void run() {

    }

    @Override
    public void steal() {

    }
}
