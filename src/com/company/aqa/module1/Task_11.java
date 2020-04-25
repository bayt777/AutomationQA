package com.company.aqa.module1;

/*
Задача 11
Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
тест: при вводе числа "1474" на выходе получим "8", так как четными являются лишь две цифры "4".*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_11 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число...");
        int num = Integer.parseInt(reader.readLine());
        int even;
        int sum = 0;
        while (num != 0) {
            even = num % 10;
            if (even % 2 == 0) {
                sum += even;
            }
            num = num / 10;
        }
        System.out.println(sum);
    }
}