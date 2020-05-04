package com.company.aqa.module4.eshop;

import com.company.aqa.module4.eshop.client.Client;
import com.company.aqa.module4.eshop.constants.Gender;
import com.company.aqa.module4.eshop.marketstaff.*;
import com.company.aqa.module4.eshop.products.Product;

import java.io.IOException;


public class MainMarket {

    public static void main(String[] args) throws IOException {
        //Create staff the shop
        MarketStaff marketStaff = new MarketStaff();
        Administrator admin = new Administrator("Garry", 44, Gender.MALE);
        Banker banker = new Banker("Sarah", 50, Gender.FEMALE);
        SalesConsultant salesConsultant = new SalesConsultant("Garry", 25, Gender.MALE);
        Security security = new Security("Dima", 33, Gender.MALE);
        Seller seller = new Seller("Sofia", 22, Gender.FEMALE);

        //Create product in market
        Product products = new Product();
        products.setPriceList(new Product(1, "Table", "Furniture", "где поесть", 1500));
        products.setPriceList(new Product(2, "Chair", "Furniture", "где поседеть", 500));
        products.setPriceList(new Product(3, "Bad", "Furniture", "где поспать", 2500));

        // business
        salesConsultant.printHello();
        Client firstClient = salesConsultant.whaIsYourName();
        String clientProduct = salesConsultant.askWahtYouWant(firstClient.getName(), products.getPriceList().toString());
        if (banker.validate(products.getPriceList(), clientProduct, firstClient)) {
            seller.selling(firstClient, clientProduct, security, products.getPriceList());
            marketStaff.sayGoodBay();
        } else {
            if (admin.sayNo(firstClient)) {
                security.cathClient(firstClient);
            } else {
                marketStaff.sayGoodBay();
            }
        }

        System.out.println("Finish!!!");

    }
}
