package com.company.aqa.module2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Определить количество дней в году, который вводит пользователь.
//        В високосном - 366 дней, в обычном 365.

public class Task_5 {

    public static void main(String[] args) throws IOException {

        int leapYear = 366;
        int normalYear = 365;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(reader.readLine());

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            System.out.println("количество дней в году: "+leapYear);
        }else{
            System.out.println("количество дней в году: "+normalYear);
        }
    }
}
