package com.company.aqa.module1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Задача 9
Определить какое из трех, введенных пользователем, чисел максимальное и вывести его на экран.

Задача 9.1
Определить какое из трех, введенных пользователем, чисел минимальное и вывести его на экран.

Задача 9.2
Пользователь вводит от 2 чисел и больше (проверочка)
- вывести минимальное на экран.
- вывести максимальное на экран.
- вывести сумму всех чисел на экран.
- вывести среднее значение чисел на экран.
*/
public class Task_9 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three numbers...");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
//max
        System.out.println("...Max number...");
        if (a < b && b > c) {
            System.out.println(b + " - maximum");
        } else if (b < a && a > c) {
            System.out.println(a + " - maximum");
        } else {
            System.out.println(c + " - maximum");
        }
//min
        System.out.println("...Min number...");
        if (a > b && b < c) {
            System.out.println(b + " - minimum");
        } else if (b > a && a < c) {
            System.out.println(a + " - minimum");
        } else {
            System.out.println(c + " - minimum");
        }
//sum
        System.out.println("...Sum and average...");
        System.out.println("Enter numbers...");
        System.out.println("Enter \"0\" for exit...");
        int sum = 0;
        for (int i = 1; ; i++) {
            a = Integer.parseInt(reader.readLine());
            if (a == 0) {
                break;
            }
            sum += a;
            System.out.println("Sum = " + sum);
//AVERAGE
            System.out.println("Average = " + sum / i);
        }
    }
}
