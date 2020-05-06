package com.company.aqa.module2;

/**
 * 6. Найти индекс числа из массива
 */
public class Task_2_6 {

    public static void main(String[] args) {

        int a = 7;
        int[] array = new int[]{7, 2, 4, 5, 2, 5, 7, 5, 2, 8, 7};

        for (int i = 0; i < array.length; i++) {

            if (array[i] == a) {
                System.out.println(i);
            }

        }
    }
}
