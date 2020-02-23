package com.company.aqa.module2;

import java.util.Scanner;

//3.  Перестановка элементов массива в обратном порядке
public class Task_2_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length for array...");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter " + length + " numbers...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        printArray(arr);

        int n = arr.length;
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = arr[n - i - 1];
            arr[n - i - 1] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }
}
