package com.company.aqa.module2;

import java.util.Arrays;

/**
 * 4. В массиве одинаковое количество четных и нечетных чисел в произвольном порядке.
 * Отсортировать массив следующим образом: четные числа расставить прямом порядке, нечетные в обратном, чередуя четные с нечетными числами. [2,9,4,7,6,5,8,3,10,1]
 */

public class Task_2_4 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));
        int lenght = array.length / 2;
        int[] odd = new int[lenght];
        int[] even = new int[lenght];

        int x = 0;
        int y = 0;
        for (int value : array) {
            if (value % 2 == 0) {
                even[x++] = value;
            } else {
                odd[y++] = value;
            }
        }
        System.out.println(Arrays.toString(odd));
        System.out.println(Arrays.toString(even));

        int[] newArr = new int[array.length];

        for (int i = 0; i < even.length; i++) {
            if (even[i] % 2 == 0) {
                newArr[i * 2] = even[i];
            }
            for (int j = odd.length - 1; j >= 0; j--) {
                if (odd[j] % 2 != 0) {
                    newArr[j * 2 + 1] = odd[odd.length - j - 1];
                }
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
