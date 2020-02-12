package com.company.aqa.module1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Задача 7
//        Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
public class Task_7 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());

        if (x + y > z) {
            System.out.println("There is triangle");
        } else if (x + z > y) {
            System.out.println("There is triangle");
        } else if (y + z > x) {
            System.out.println("There is triangle");
        } else
            System.out.println("There isn't triangle");
    }
}
