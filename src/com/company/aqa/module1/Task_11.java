package com.company.aqa.module1;

/*
Задача 11
Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
тест: при вводе числа "1474" на выходе получим "8", так как четными являются лишь две цифры "4".*/

public class Task_11 {

    public static void main(String[] args) {

        int num = 1474;
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