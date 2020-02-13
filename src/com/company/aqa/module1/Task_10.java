package com.company.aqa.module1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* Задача 10
Пользователь вводит число любой длины
Определить четное или нечетное число.*/
public class Task_10 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three numbers...");
        double a = Double.parseDouble(reader.readLine());

        if (a % 2 == 0) {
            System.out.println(a + " is even number");
        } else {
            System.out.println(a + " is not even number");
        }
    }
}
