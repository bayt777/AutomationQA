package com.company.aqa.module3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
1. (Scanner + String)
Определить, как часто встречается определенный символ в строке.
* */
public class Task_3_1 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String words = reader.readLine();

        HashMap<Character, Integer> map = new HashMap<>(40);
        for (int i = 0; i < words.length(); ++i) {
            char c = words.charAt(i);
            if (Character.isLetter(c)) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }
        for (HashMap.Entry<Character, Integer> pair : map.entrySet()) {
            System.out.println("\"" + pair.getKey() + "\" = " + pair.getValue());
        }
    }
}
