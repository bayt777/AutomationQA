package com.company.aqa.module4.eshop.marketstaff;

import com.company.aqa.module4.eshop.client.Client;
import com.company.aqa.module4.eshop.products.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Seller extends MarketStaff {

    private String name;
    private int age;
    private String gender;

    public Seller(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void walk() {

    }

    public void selling(Client firstClient, String product, Security security, ArrayList<Product> arrayList) throws IOException {
        System.out.println("Кассир");
        Product prod = arrayList.stream().filter(p -> p.getName().contains(product)).findFirst().orElse(null);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("I can sell " + product + " to you, " + firstClient.getName() + "!");
        if (prod != null) {
            System.out.println(firstClient.getName() + " give me please money, " + prod.getPrice());
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
                security.cathClient(firstClient);
            }
        }
    }
}
