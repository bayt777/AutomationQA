package com.company.aqa.module4.eshop.marketstaff;

import com.company.aqa.module4.eshop.client.Client;
import com.company.aqa.module4.eshop.products.Product;

import java.util.ArrayList;

public class Banker extends MarketStaff {
    private String name;
    private int age;
    private String gender;

    public Banker(String name, int age, String gender) {
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

    public boolean validate(ArrayList<Product> products, String clientProduct, Client client) {
        System.out.println("Бухгалтер");
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
