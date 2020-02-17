package com.company.aqa.module1;

/*
Задача 16
Построить таблицу умножения и выведите в консоль посредством вложенных циклов >:o. (вид должен быть как на школьной тетрадке =) )
Используйте форматированием строк для красивого вывода.*/

public class Task_16 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int k = 1; k < 10; k++) {
                System.out.print(k * i + "  ");
            }
            System.out.println();
        }
    }
}
