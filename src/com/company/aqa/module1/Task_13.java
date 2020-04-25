package com.company.aqa.module1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Задача 13
Написать метод вычисляющий все простые числа от 1 до числа введенного пользователем.
Дополнительно вывести сумму всех найденных простых чисел.*/
public class Task_13 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());

        int sum = 0;
        int currentNumber;
        int dividers;
        for (currentNumber = 1; currentNumber < x; currentNumber++) {
            dividers = 0;
            for (int i = 1; i <= currentNumber; i++) {
                if (currentNumber % i == 0)
                    dividers++;
            }
            if (dividers <= 2) {
                System.out.println(currentNumber);
                sum += currentNumber;
            }
        }
        System.out.println("Sum equals = " + sum);
    }
}
