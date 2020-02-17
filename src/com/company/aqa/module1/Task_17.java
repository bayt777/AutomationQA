package com.company.aqa.module1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Задача 17
Написать программу, которая находит все комбинации из трех чисел до определенного предела, которые в сумме дают другое число.
тест:
       Предел для перебираемых чисел: 5
       Искомая сумма: 10

Вывод: 1 4 5 // 10
       1 5 4 // 10
       2 3 5 // 10
       2 4 4 // 10
       ....
       ....
 */
public class Task_17 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(reader.readLine());
        int sum = Integer.parseInt(reader.readLine());

        for (int i = 1; i < limit; i++) {
            for (int j = 1; j < limit; j++) {
                for (int k = 1; k < limit; k++) {
                    if (sum == i + j + k)
                        System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }
}