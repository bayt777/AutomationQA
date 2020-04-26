package com.company.aqa.module3;

//3. (Scanner + String)
//        Удалить из строки ее часть с заданной позиции и заданной длины.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3_3 {

    public static void main(String[] args) throws IOException {
        int startNum;
        int endNum;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a line...");
        String s = reader.readLine();
        System.out.println("Enter the character number from which to start the deletion:");
        startNum = Integer.parseInt(reader.readLine());
        if (startNum > s.length()) {
            System.out.println("The string is longer than your number");
        } else {
            System.out.println("Enter the number of characters to remove from the string:");
            endNum = Integer.parseInt(reader.readLine());
            if (startNum + endNum > s.length()) {
                System.out.println("The string is longer than your number");
            } else {
                StringBuilder sb = new StringBuilder(s);
                s = sb.delete(startNum, startNum + endNum).toString();
                System.out.println(s);
            }
        }
    }
}
