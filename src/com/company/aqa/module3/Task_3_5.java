package com.company.aqa.module3;
/*
5. (Scanner + String) ОБЯЗЯТЕЛЬНО РЕШИТЬ !!!
Вывести слова в обратном порядке.
+ применить алгоритм с задачи 2, т.е. слова идут в обратном порядке +они перевернуты.*/

public class Task_3_5 {
    public static void main(String[] args) {
        String word = "Вывести слова в обратном порядке. + применить алгоритм с задачи 2, т.е. слова идут в обратном порядке +они перевернуты.";
        StringBuffer buffer = new StringBuffer(word);
        System.out.println(buffer.reverse());
    }
}
