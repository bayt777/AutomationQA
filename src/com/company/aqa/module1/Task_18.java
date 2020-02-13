package com.company.aqa.module1;

/*
* Задача 18
Вывод на экран таблицы ASCII
Вывод на экран соответствий между символами и их численными обозначениями.*/
public class Task_18 {
    public static void main(String[] args) {
        String allSymbols = "` 1234567890-=qwertyuiop[]asdfghjkl;'\\ zxcvbnm,./йцукенгшщзхъфывапролджэячсмитьбю./ *-";

        int number = 1;

        for (char symbol : allSymbols.toCharArray()) {
            String hexSymbolValue = String.format("%04x", (int) symbol);
            int octalSymbolValue = (int) symbol;

            System.out.println("Symbol: " + number + " " + symbol + " " + hexSymbolValue + " " + octalSymbolValue);

            number++;
        }
    }
}
