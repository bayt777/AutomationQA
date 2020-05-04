package com.company.aqa.module4.eshop.marketstaff;

import com.company.aqa.module4.eshop.Human;
import com.company.aqa.module4.eshop.client.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Administrator extends MarketStaff implements Human {

    private String name;
    private int age;
    private String gender;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Administrator(String name, int age, String gender) {
    }

    @Override
    public void run() {
        super.run();
    }

    public boolean sayNo(Client firstClient) throws IOException {
        System.out.println("We can't sell you product, validation was failed!");
        System.out.println("What you think about");
        String answer = reader.readLine();
        if (answer.contains("WTF")) {
            System.out.println("Охрана взять " + firstClient.getName() + ". Это мошенник!!!");
            return true;
        } else {
            return false;
        }
    }
}
