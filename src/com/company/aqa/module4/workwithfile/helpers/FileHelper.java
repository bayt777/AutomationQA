package com.company.aqa.module4.workwithfile.helpers;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHelper implements IFile {

    @Override
    public String fileReader(String filePath) {

        StringBuilder stringBuilder = new StringBuilder();

        try (FileReader reader = new FileReader(filePath)) {

            int c;
            while ((c = reader.read()) != -1) {
                stringBuilder.append((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        return stringBuilder.toString();
    }

    @Override
    public void fileWriter(String filePath, String text) {

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("File is recorded!");
    }
}
