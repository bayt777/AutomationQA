package com.company.aqa.module3;

/*2. (Scanner + String)
Перевернуть слова, т.е. последовательность слов остается, но слова написаны задом на перед.
*/
public class Task_3_2 {
    public static void main(String[] args) {
        String word = "Перевернуть слова, т.е. последовательность слов остается, но слова написаны задом на перед.";
        char[] array = word.toCharArray();
        char[] b = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            b[(array.length - 1) - i] = array[i];
        }
        System.out.println(b);
    }

}
