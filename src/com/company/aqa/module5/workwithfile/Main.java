package com.company.aqa.module5.workwithfile;

import com.company.aqa.module5.workwithfile.helpers.FileHelper;
import com.company.aqa.module5.workwithfile.helpers.StringHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        StringHelper sh = new StringHelper();
        FileHelper fh = new FileHelper();

        new Salutation().salut();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Откуда считываем строки
        System.out.println("Choose input source, enter \"f\" - file  or \"c\"- console");
        String sourceIn = reader.readLine();

        //Куда пишем результат
        System.out.println("Choose output source, enter \"f\" - file  or \"c\"- console");
        String sourceOut = reader.readLine();

        //определить, как часто встречается определенный символ в строке
        System.out.println("Enter the character you want to count: ");
        String character = reader.readLine();

        if (sourceIn.contains("f")) {

            System.out.println("Enter input file path:");
            String path = reader.readLine();
            String text = fh.fileReader(path);

            if (sourceOut.contains("f")) {
                System.out.println("Enter output file path:");
                String fileOutputPath = reader.readLine();
                System.out.println(sh.findLetter(character, text));
                fh.fileWriter(fileOutputPath, sh.printMap(sh.countAllLetters(text)));
                reader.close();
            }

            if (sourceOut.contains("c")) {
                System.out.println("Text from file:\n");
                System.out.println(text);
                sh.countAllLetters(text);
                System.out.println(sh.findLetter(character, text));
            }

        } else {

            System.out.println("Enter some text:");
            String text = reader.readLine();

            if (sourceOut.contains("f")) {
                System.out.println("Enter output file path:");
                String fileOutputPath = reader.readLine();
                System.out.println(sh.findLetter(character, text));
                fh.fileWriter(fileOutputPath, sh.printMap(sh.countAllLetters(text)));

            }

            if (sourceOut.contains("c")) {
                System.out.println("Text from file:\n");
                System.out.println(text);
                sh.countAllLetters(text);
                System.out.println(sh.findLetter(character, text));
            }
            reader.close();
        }
    }
}
