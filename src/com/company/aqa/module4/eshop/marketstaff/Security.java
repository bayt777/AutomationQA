package com.company.aqa.module4.eshop.marketstaff;

import com.company.aqa.module4.eshop.client.Client;

public class Security extends MarketStaff {

    private String name;
    private int age;
    private String gender;

    public Security(String name, int age, String gender) {
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

    public void cathClient(Client firstClient) {
        System.out.print("Охрана");
        System.out.println(firstClient.getName() + "Стоять, стрелять буду!");
    }
}
