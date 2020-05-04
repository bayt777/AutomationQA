package com.company.aqa.module4.eshop.marketstaff;

import com.company.aqa.module4.eshop.client.Client;
import com.company.aqa.module4.eshop.marketstaff.constatns.Positions;
import com.company.aqa.module4.eshop.products.Product;

import java.util.ArrayList;

public class Banker extends MarketStaff {

    public Banker(String name, int age, String gender) {
        super(name, age, gender);
    }

    public boolean validate(ArrayList<Product> products, String clientProduct, Client client) {
        sayWelcomeMsgAndIntroduce(client.getName(), Banker.this.getName(), Positions.BANKER);
        boolean answer = false;
        Product prod = products.stream().filter(p -> p.getName().contains(clientProduct)).findFirst().orElse(null);
        if (prod != null && prod.getName().contains(clientProduct)) {
            System.out.println("Product is present");
            if (client.getAge() >= 18) {
                System.out.println("Client is adult");
                if (client.getCashBalance() >= prod.getPrice()) {
                    System.out.println("Client has enough money for buy " + prod.getName());
                    answer = true;
                }
            }
        }
        return answer;
    }
}
