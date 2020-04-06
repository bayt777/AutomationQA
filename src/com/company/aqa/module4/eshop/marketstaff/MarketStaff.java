package com.company.aqa.module4.eshop.marketstaff;

import com.company.aqa.module4.eshop.Person;

public abstract class MarketStaff extends Person {


    String shopName = "Rozetka";


    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}
