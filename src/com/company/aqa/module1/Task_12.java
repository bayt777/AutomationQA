package com.company.aqa.module1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* Задача 12
Написать метод вычисляющий и возвращающий факториал числа.
тест: 1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040*/
public class Task_12 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число...");
        int x = Integer.parseInt(reader.readLine());
        int result = 1;

        for (int i = 1; i <= x; i++) {
            result = result * i;
        }
        System.out.println("Факториал числа " + x + " = " + result);
    }
}
