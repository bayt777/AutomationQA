package com.company.aqa.module4.eshop.marketstaff;

public class Seller extends MarketStaff {

    String name;

    public Seller() {
    }

    @Override
    public void walk() {
        System.out.println("I can sell you this product");
    }
}
