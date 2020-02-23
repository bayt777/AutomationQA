package com.company.aqa.module2;

import java.util.Scanner;

/*
 * Найти максимальное значение из массива
 */
public class Task_2_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length for array...");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter " + length + " numbers...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        for (int value : arr) {
            if (value > max)
                max = value;
        }
        System.out.println("Max number in array is = " + max);
    }
}

