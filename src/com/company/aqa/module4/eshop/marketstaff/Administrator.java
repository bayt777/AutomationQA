package com.company.aqa.module4.eshop.marketstaff;

import com.company.aqa.module4.eshop.base.Human;
import com.company.aqa.module4.eshop.client.Client;
import com.company.aqa.module4.eshop.marketstaff.constatns.Positions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Administrator extends MarketStaff implements Human {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Administrator(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void run() {
        super.run();
    }

    public boolean sayNo(Client client) throws IOException {
        sayWelcomeMsgAndIntroduce(client.getName(), Administrator.this.getName(), Positions.ADMINISTRATOR);
        System.out.println("We can't sell you product, validation was failed!");
        System.out.println("What you think about");
        String answer = reader.readLine();
        if (answer.contains("WTF")) {
            System.out.println("Охрана взять " + client.getName() + ". Это мошенник!!!");
            return true;
        } else {
            return false;
        }
    }
}
