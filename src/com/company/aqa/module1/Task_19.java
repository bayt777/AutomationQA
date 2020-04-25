package com.company.aqa.module1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_19 {
    /*
     * Задача 19
     * Написать программу, в которой вводятся два числа Х и Y и знак операции (+, –, /, *).
     * Вычислить результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а также на ввод Y=0 при делении.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two numbers...");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        System.out.println("Operation sign...");
        String sign = reader.readLine();
        if (sign.contains("+") || sign.contains("-") || sign.contains("/") || sign.contains("*")) {
            switch (sign) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
            }
        } else {
            System.out.println("Wrong sign!!! Try again!");
        }
    }
}
