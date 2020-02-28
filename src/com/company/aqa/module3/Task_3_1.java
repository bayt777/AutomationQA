package com.company.aqa.module3;

import java.util.Arrays;

/*
1. (Scanner + String)
Определить, как часто встречается определенный символ в строке.
* */
public class Task_3_1 {
        static String words = "Hello world! Hey My name is Dima!";
        static char[] mas = words.toCharArray();
    public static void main(String[] args) {

        System.out.println(Arrays.toString(mas));
        int number = 0;
        String s = "";
        for (char c : mas) {
            for (char ma : mas) {
                if (String.valueOf(ma).contains(String.valueOf(c))) {
                    s = String.valueOf(ma);
                    number++;
                }
            }
            if (s.contains(" "))
                s = "пробел";
            System.out.println(s + " = " + number);
            number = 0;
//            arrInc(mas, c);
        }
    }

    private static void arrInc(char[] arr, char elem) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = elem;
        mas = arr;
    }
}
