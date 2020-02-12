package com.company.aqa.module1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Задача 1:
//Определить какое из трех, введенных пользователем, чисел максимальное и вывести его на экран.

public class Task_1 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 3 numbers:");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a == b && b == c) {
            System.out.println("All number is equals");
        } else if (a >= b && b >= c) {
            System.out.println(a + " - is maximum");
        } else if (b >= a && b >= c) {
            System.out.println(b + " - is maximum");
        } else
            System.out.println(c + " - is maximum");
    }
}
