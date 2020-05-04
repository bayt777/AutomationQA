package com.company.aqa.module4.eshop.marketstaff;

import com.company.aqa.module4.eshop.client.Client;
import com.company.aqa.module4.eshop.marketstaff.constatns.Positions;
import com.company.aqa.module4.eshop.products.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Seller extends MarketStaff {

    public Seller(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void selling(Client client, String product, Security security, ArrayList<Product> arrayList) throws IOException {
        sayWelcomeMsgAndIntroduce(client.getName(), Seller.this.getName(), Positions.SELLER);
        Product prod = arrayList.stream().filter(p -> p.getName().contains(product)).findFirst().orElse(null);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("I can sell " + product + " to you, " + client.getName() + "!");
        if (prod != null) {
            System.out.println(client.getName() + " give me please money, " + prod.getPrice());
            double money = Double.parseDouble(reader.readLine());
            double price = prod.getPrice();
            if (price == money) {
                System.out.println("Thanks, take please product");
            }
            if (money > price) {
                System.out.println("Возьмите здачу - " + price);
            }
            if (money < price) {
                System.out.println("Охрана отмена!!!");
                security.catchClient(client);
            }
        }
    }
}
