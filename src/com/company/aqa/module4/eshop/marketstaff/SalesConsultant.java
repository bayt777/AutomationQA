package com.company.aqa.module4.eshop.marketstaff;

import com.company.aqa.module4.eshop.Human;
import com.company.aqa.module4.eshop.client.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SalesConsultant extends MarketStaff implements Human {

    private String name;
    private int age;
    private String gender;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public SalesConsultant(String name, int age, String gender) {
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

    public void printHello() {
        System.out.println("Welcome to e-shop *** " + getShopName().toUpperCase() + " ***");
        System.out.println("Hi!\nMy name is " + name + " I'm sales consultant");
    }

    public Client whaIsYourName() throws IOException {
        System.out.println("What is your name?");
        String words = null;
        try {
            words = reader.readLine();
        } catch (IOException e) {
            System.out.println("Name must be word");
        }
        System.out.println("How old are you?");
        int age = 0;
        try {
            age = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Age must be number");
        }
        System.out.println("How much money do you have?");
        double cash = 0;
        try {
            cash = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Money must be double");
        }
        return new Client(words, age, cash);
    }

    public String askWahtYouWant(String name, String priceList) throws IOException {
        System.out.println("What you want " + name + "?");
        System.out.println("You can make choice from our price list:");
        System.out.println(priceList);
        return reader.readLine();
    }

}
