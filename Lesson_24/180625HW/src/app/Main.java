package app;

import static java.awt.Color.black;

/*
Задача 2
Создайте класс Auto (машина) Поля: брэнд, цвет, год выпуска, цена Создайте несколько объектов этого класса.
Напишите метод, который выводит на экран данные машины.
 */
public class Main {
    public static void main(String[] args) {

        Auto car1  = new Auto("BMW M5", "blue", 2023, 35900);
        Auto car2  = new Auto("Ford Mustang", "grey", 2025, 29500);
        printDate(car1);
        printDate(car2);

    }
    public static void printDate(Auto date) {
        System.out.println(date.brand + ", " + date.color + ", " + date.year + ", " + date.price + " .");
    }
}
