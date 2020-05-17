package com.company.aqa.module5.workwithfile.helpers;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringHelper {


    public Map<Character, Long> countAllLetters(String str) {

        Map<Character, Long> frequency =
                str.toLowerCase().chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (Map.Entry entry : frequency.entrySet()) {
            String text = "Character : \"" + entry.getKey() + "\" occurs " + entry.getValue() + " times";
            System.out.println(makeColor(text, "blue"));
        }
        return frequency;
    }

    /**
     * Use for find count of letter in the text
     *
     * @param letter   letter
     * @param someText text
     */
    public String findLetter(String letter, String someText) {

        char[] arr = someText.toCharArray();
        int count = 0;
        for (char c : arr) {
            if (letter.charAt(0) == c)
                count++;
        }
        String text = "Character : \"" + letter + "\" occurs " + count + " times";
        return makeColor(text, "red");
    }

    public String makeColor(String str, String color) {
        String text;
        switch (color) {
            case "red":
                text = (char) 27 + "[31m" + str + (char) 27 + "[0m";
                break;
            case "blue":
                text = (char) 27 + "[34m" + str + (char) 27 + "[0m";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + color);
        }
        return text;
    }

    public String printMap(Map<Character, Long> map) {
        StringBuilder stringBuilder = new StringBuilder();
        String newText = "";
        for (Map.Entry entry : map.entrySet()) {
            String text = "Character : \"" + entry.getKey() + "\" occurs " + entry.getValue() + " times";
            newText = stringBuilder.append(text).append("\n").toString();
        }
        return newText;
    }

}
