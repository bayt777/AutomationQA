package com.company.aqa.module3;

/*2. (Scanner + String)
Перевернуть слова, т.е. последовательность слов остается, но слова написаны задом на перед.
*/
public class Task_3_2 {

    public static void main(String[] args) {
        String s = "Перевернуть слова, т.е. последовательность слов остается, но слова написаны задом на перед.";
        StringBuilder temp = new StringBuilder();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                temp.append(s.charAt(i));
            } else {
                res.append(temp.reverse()).append(s.charAt(i));
                temp.setLength(0);
            }
        }
        System.out.println(res.toString());
    }
}
