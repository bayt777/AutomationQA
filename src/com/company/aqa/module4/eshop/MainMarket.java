package com.company.aqa.module4.eshop;

import com.company.aqa.module4.eshop.constants.Gender;
import com.company.aqa.module4.eshop.marketstaff.Administrator;


public class MainMarket {

    public static void main(String[] args) {


        Administrator admin = new Administrator("Garry", 44, Gender.MALE);

        System.out.println(admin.getShopName());
    }
}
