package com.company.aqa.module4.eshop.marketstaff;

import com.company.aqa.module4.eshop.Person;

public class MarketStaff extends Person {


    private String shopName = "Rozetka";


    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Override
    public void talk() {

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
}
