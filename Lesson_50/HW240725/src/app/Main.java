package app;

import java.io.*;
import java.util.Scanner;

/*
1. a) Напишите программу, которая позволяет пользователю вводить с клавиатуры строки
 и записывает эти строки в файл. Для выхода из программы, пользователь должен ввести строку “exit”.
  В итоге должен быть файл со всеми введенными строками.
b) Ваша программа должна прочитать сформированный файл и вывести его содержимое на экран.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("File.txt"))) {
        while (true) {
            System.out.println("Введите текст(для выхода введите 'exit': ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) break;
            writer.write(input);
            writer.newLine();
         }
    }catch (IOException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
        }
        System.out.println("Содержимое файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader("File.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}


