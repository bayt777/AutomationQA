package com.company.aqa.module4.eshop.marketstaff;

import com.company.aqa.module4.eshop.base.Human;
import com.company.aqa.module4.eshop.client.Client;
import com.company.aqa.module4.eshop.marketstaff.constatns.Positions;
import com.company.aqa.module4.eshop.products.departments.ProductDepartment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SalesConsultant extends MarketStaff implements Human {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private ProductDepartment depart;

    public SalesConsultant(String name, int age, String gender, ProductDepartment department) {
        super(name, age, gender);
        this.depart = department;

    }

    public ProductDepartment getDepart() {
        return depart;
    }

    public void setDepart(ProductDepartment depart) {
        this.depart = depart;
    }

    public Client whaIsYourName() throws IOException {

        System.out.println("What is your name?");
        String words = null;
        try {
            words = reader.readLine();
        } catch (IOException e) {
            System.out.println("Name must be word");
        }
        sayWelcomeMsgAndIntroduce(words, SalesConsultant.this.getName(), Positions.SALES_CONSULTANT);
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

    public String askWahtYouWant(String clientName, String priceList) throws IOException {
        System.out.println("What you want " + clientName + "?");
        System.out.println("You can make choice from our price list:");
        System.out.println(priceList);
        return reader.readLine();
    }

}
