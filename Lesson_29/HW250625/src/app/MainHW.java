package app;
/*
Задача 1
Напишите программу, которая позволяет пользователю вводить целые числа.
Как только пользователь введет 0 - считаем что ввод закончен.
Программа должна вывести на экран все введенные числа и их сумму
 */
import java.util.ArrayList;
import java.util.Scanner;

public class MainHW {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int sum = 0;


        System.out.println("Введите целое число (если 0, то завершаем ввод): ");
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) break;
            numbers.add(input);
            sum += input;

        }
        System.out.println("Введенные числа: " + numbers);
        System.out.println("Сумма: " + sum);
    }

}
