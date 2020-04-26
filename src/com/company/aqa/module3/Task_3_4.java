package com.company.aqa.module3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3_4 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a line...");
        String s = reader.readLine();
        System.out.println("Lenght line is: " + s.length());

    }
}
