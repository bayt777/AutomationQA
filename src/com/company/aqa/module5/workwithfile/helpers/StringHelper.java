package com.company.aqa.module5.workwithfile.helpers;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringHelper {


    public Map<Character, Long> countAllLetters(String str) {

        Map<Character, Long> frequency = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        frequency.forEach((character, aLong) -> System.out.println(makeColor("Character : \"" + character + "\" occurs " + aLong + " times", "blue")));
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
        map.forEach((character, aLong) -> stringBuilder.append("Character : \"").append(character).append("\" occurs ").append(aLong).append(" times").append("\n"));
        return stringBuilder.toString();
    }

}
