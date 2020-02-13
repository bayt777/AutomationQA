package com.company.aqa.module1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

//Задача 4
//        Угадать число, которое загадал пользователь, используя if-else.
public class Task_4 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number from 1 to 5");
        System.out.println("I find this number");
        Random random = new Random();
        int x = random.nextInt(5);
        System.out.println("It is - " + x + " \ny/n?");
        String ans = "n";
        while (ans.equals("n")) {
            if (x != 5) {
                ans = reader.readLine();
                System.out.println("It is - " + x + " \ny/n?");
                x++;
            } else
            if (x != 0){
                ans = reader.readLine();
                System.out.println("It is - " + x + " \ny/n?");
                x--;
            }

        }
    }
}
