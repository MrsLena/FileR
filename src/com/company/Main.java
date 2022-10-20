package com.company;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.*;


public class Main {

    public static final String FILE_NAME = "1.txt";

    public static void main(String[] args) {



        read();

    }

    private static void read() {


        try (FileWriter fw = new FileWriter("2.txt")) {

          Scanner sca =new Scanner(System.in);
          try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

           List<String> list = reader.lines().collect(Collectors.toList());
           for (String ss : list) {
                System.out.println("Введите возраст сотрудника " + ss);
                int a = sca.nextInt();

                fw.write(ss + " - " + Integer.toString(a) + "\n");
           }

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            fw.close();
        }  catch (IOException e){
            System.err.println("Error writing  2.txt");
        }


    }
}
