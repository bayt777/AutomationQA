package com.company.aqa.module1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* Задача 14
Дано число. Найти сумму и произведение его цифр.
* */
public class Task_14 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число:");
        int x = Integer.parseInt(reader.readLine());

        int sum = 0;
        int mult = 1;
        while (x > 0) {
            sum += x % 10;
            mult *= x % 10;
            x = x / 10;
        }
        System.out.println("Сумма = " + sum + ", Произведение = " + mult);

    }
}
