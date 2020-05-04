package com.company.aqa.module4.eshop;

import com.company.aqa.module4.eshop.client.Client;
import com.company.aqa.module4.eshop.constants.Gender;
import com.company.aqa.module4.eshop.marketstaff.*;
import com.company.aqa.module4.eshop.products.Product;
import com.company.aqa.module4.eshop.products.departments.AppliacnesDep;
import com.company.aqa.module4.eshop.products.departments.FurnitureDep;
import com.company.aqa.module4.eshop.products.departments.ProductDepartment;

import java.io.IOException;


public class MainMarket {

    public static void main(String[] args) throws IOException {

        //Create department
        ProductDepartment dep_1 = new FurnitureDep("Dep_1", "Furniture");
        ProductDepartment dep_2 = new AppliacnesDep("Dep_2", "Appliacnes");

        //Create staff the shop
        Administrator admin = new Administrator("Garry", 44, Gender.MALE);
        Banker banker = new Banker("Sarah", 50, Gender.FEMALE);
        SalesConsultant consultantFurniture = new SalesConsultant("Bob", 25, Gender.MALE, dep_1);
        SalesConsultant consultantApp = new SalesConsultant("Calvin", 25, Gender.MALE, dep_2);
        Security security = new Security("Dima", 33, Gender.MALE);
        Seller seller = new Seller("Sofia", 22, Gender.FEMALE);



        //Create product in market
        Product products = new Product();
        products.setPriceList(new Product(1, "Table", dep_1, "где поесть", 1500));
        products.setPriceList(new Product(2, "Chair", dep_1, "где поседеть", 500));
        products.setPriceList(new Product(3, "Bad", dep_1, "где поспать", 2500));
        products.setPriceList(new Product(4, "TV", dep_2, "watching", 10000));

        // business
        Client firstClient = consultantFurniture.whaIsYourName();
        String clientProduct = consultantFurniture.askWahtYouWant(firstClient.getName(), products.getPriceList().toString());
        if (banker.validate(products.getPriceList(), clientProduct, firstClient)) {
            seller.selling(firstClient, clientProduct, security, products.getPriceList());
            seller.sayGoodBay();
        } else {
            if (admin.sayNo(firstClient)) {
                security.catchClient(firstClient);
            } else {
                admin.sayGoodBay();
            }
        }

        System.out.println("Finish!!!");

    }
}
