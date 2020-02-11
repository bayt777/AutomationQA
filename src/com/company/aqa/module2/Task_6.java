package com.company.aqa.module2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Задача 6
//        Определить, кратно ли заданное число трем; если нет, вывести остаток.
public class Task_6 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        int y = x % 3;
        if (y != 0) {
            System.out.println(x + " - не кратно 3, остаток от деления - " + y);
        } else
            System.out.println(x + " - кратно 3");

    }
}
