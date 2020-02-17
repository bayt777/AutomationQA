package com.company.aqa.module1;

/*Задача 15
Вывести все квадраты натуральных чисел, не превосходящие данного числа N.
Пример: N=50 | 1 4 9 16 25 36 49*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_15 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(reader.readLine());

        for (int i = 1; i < limit; i++) {
            int a = i * i;
            if (a < limit)
                System.out.println(a);

        }
    }
}
