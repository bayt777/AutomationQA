package com.company.aqa.module2;

//Задача 2
// Обменять значения двух переменных, используя третью (буферную) переменную.

public class Task_2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int buffer;
        System.out.println("a = " + a + " b = " + b);
        buffer = a;
        a = b;
        b = buffer;
        System.out.println("a = " + a + " b = " + b);
    }
}
