package com.company.aqa.module4.eshop.marketstaff;

import com.company.aqa.module4.eshop.base.Person;

public abstract class MarketStaff extends Person {

    private String shopName = "Rozetka";

    public MarketStaff(String name, int age, String gender) {
        super(name, age, gender);
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Override
    public void talk() {
        System.out.println("I can talk");
    }

    @Override
    public void walk() {
        System.out.println("I go to product");
    }

    @Override
    public void run() {
        System.out.println("I run out side");
    }

    @Override
    public void steal() {

    }

    public void sayWelcomeMsgAndIntroduce(String clientName, String staffName, String position) {
        System.out.println("Hello " + clientName + "!!!");
        System.out.println("My name is " + staffName + ", I am "+ position);
        System.out.println("Welcome to e-shop *** " + getShopName().toUpperCase() + " ***");
    }

    public void sayGoodBay() {
        System.out.println("All market staff say GoodBay!!!");
    }
}
