package examples;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import  java.io.BufferedReader;
import java.io.FileReader;

public class NewFile {
    public static void main(String[] args) {
        BufferedReader lol = null;
        try {
            File file = new File("newFile.txt");
            if (!file.exists())
                file.createNewFile();
            PrintWriter text = new PrintWriter(file);
            text.println("maybe working");
            text.println("my english is perfect $) ");
            text.println("hallo Denchik");
            text.println("i need hard working");
            text.println("ma fucka :)");
            text.close();
            lol = new BufferedReader(new FileReader("newFile.txt"));
            String line;
            while ((line = lol.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException a) {
            System.out.println("Error: " + a);
        } finally {
            try {
                lol.close();
            } catch (IOException a) {
                System.out.println("Error: " + a);

            }
        }

    }}
