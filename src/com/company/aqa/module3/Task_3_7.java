package com.company.aqa.module3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
7. (Scanner) ОБЯЗЯТЕЛЬНО РЕШИТЬ !!!
Пользователь вводит слова по одному. Прервать ввод нужно написав в консоль "EXIT".
Рандомными образом расставить введенные слова чтобы получилась одна строка-предложение.
* */

public class Task_3_7 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter couple of worlds...");
        List<String> list = new ArrayList<>();
        String s;
        do {
            s = reader.readLine();
            if (!s.equals("EXIT"))
                list.add(s);
        } while (!s.equals("EXIT"));

        Collections.shuffle(list);
        for (String value : list) {
            System.out.print(value + " ");
        }
    }
}
