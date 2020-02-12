package com.company.aqa.module1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Задача 3
        Из двух чисел с разной четностью, вывести на экран нечетное число.
        Пользователь вводит четное и нечетное число. Последовательность их ввода может быть любой.
        *Пользователь не может ввести меньше 2 чисел, в противном случае выводить об этом сообщение.

        Задача 3.1 (Scanner)
        Из введенных чисел с разной четностью, вывести на экран сколько четных и сколько нечетных чисел было введено.
        Пользователь вводит четные / нечетные числа. Последовательность их ввода может быть любой.
        *Пользователь не может ввести меньше 2 чисел, в противном случае выводить об этом сообщение.
 */
public class Task_3 {

    private static int count;
    private static int even;
    private static int notEven;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter numbers:");
        int a;
        do {
            a = Integer.parseInt(reader.readLine());

            if (a % 2 == 0) {
                System.out.println(a + " is even number");
                ++even;
            } else {
                System.out.println(a + " is not even number");
                ++notEven;
            }
            System.out.println("You entered " + ++count + " numbers: " + even + " even numbers, " + notEven + " not even numbers");
            System.out.println("If you finished, enter \"0\" for exit");

        } while (a != 0);
        System.out.println("Program closed");

    }
}
