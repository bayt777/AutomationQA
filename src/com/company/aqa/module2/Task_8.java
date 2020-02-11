package com.company.aqa.module2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Задача 8 (switch-case)
Возрастная категория.
Пользователь вводит число от 1 до 100.
Разбить 100 летний отрезок по 10 лет образно обозначив их (пример: 0-10 - юнец, 30-40 - старЫк, 70-80 - столько не живут...)
 */

public class Task_8 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите возраст...");
        int s = Integer.parseInt(reader.readLine());

        if (s > 100) {
            System.out.println("Та ну нах..!");
        } else
            switch (s / 10 + 1) {
                case 1:
                    System.out.println("Мелкий!");
                    break;
                case 2:
                    System.out.println("Можешь работать!");
                    break;
                case 3:
                    System.out.println("Можешь зарабатывать!");
                    break;
                case 4:
                    System.out.println("Заведи уже наконец то детей!");
                    break;
                case 5:
                    System.out.println("Подумай о пенсии!");
                    break;
                case 6:
                    System.out.println("Пора бы отдохнуть!");
                    break;
                case 7:
                    System.out.println("Вторая молодость?");
                    break;
                case 8:
                    System.out.println("Зубы уже выпали?");
                    break;
                case 9:
                    System.out.println("Еще живой?");
                    break;
                case 10:
                    System.out.println("Пора бы и к земле уже?");
                    break;
            }

    }
}
