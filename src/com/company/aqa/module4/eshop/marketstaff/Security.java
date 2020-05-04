package com.company.aqa.module4.eshop.marketstaff;

import com.company.aqa.module4.eshop.client.Client;
import com.company.aqa.module4.eshop.marketstaff.constatns.Positions;

public class Security extends MarketStaff {

    public Security(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void catchClient(Client client) {
        sayWelcomeMsgAndIntroduce(client.getName(), Security.this.getName(), Positions.SECURITY);
        System.out.println(client.getName() + " Stop, I will shoot!");
    }
}
