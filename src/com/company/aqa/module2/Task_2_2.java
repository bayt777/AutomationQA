package com.company.aqa.module2;

import java.util.Scanner;

//Найти три наибольших числа из массива
public class Task_2_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length for array...");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter " + length + " numbers...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        System.out.println("Max numbers in array is = " + arr[arr.length - 1] + ", " + arr[arr.length - 2] + ", " + arr[arr.length - 3]);
    }
}
