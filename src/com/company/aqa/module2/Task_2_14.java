package com.company.aqa.module2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 14. Найти в массиве число, которое повторяется наибольшее количество раз.
 */
public class Task_2_14 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Set length array:");
        int length = Integer.parseInt(reader.readLine());
        int[] arr = new int[length];
        System.out.println("Put " + length + " numbers into the array:");
        int x = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.print((x++) + ": ");
            arr[i] = Integer.parseInt(reader.readLine());

            if (i == length - 1) {
                break;
            }
        }

        int n = 0;
        int frec = 0;
        for (int temp : arr) {
            int narr = frequensy(arr, temp);
            if (frec < narr) {
                n = temp;
                frec = narr;
            }
        }

        System.out.println("The number " + n + " is repeated " + frec + " times");

    }

    static int frequensy(int[] arr, int x) {
        int n = 0;
        for (int temp : arr) {
            if (x == temp) {
                n++;
            }
        }
        return n;
    }


}
