package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shop {
    public static void main(String[] args) {
        List<Product> product = new ArrayList<>();
        product.add(new Product("Хлеб", 1.79));
        product.add(new Product("Молоко", 1.05));
        product.add(new Product("Масло", 2.39));
        product.add(new Product("Колбаса", 2.99));
        product.add(new Product("Рис", 0.99));
        print(product);
    }

    public static List<Product> print(List<Product> product) {
        for (Product products : product) {
            System.out.print(products);
        }
        System.out.println("=============================");
        System.out.println("Общая сумма заказа и товар:  ");
        String[] products = {"Хлеб", "Молоко", "Масло", "Колбаса","Рис"};
        double[] prices = {1.79, 1.05, 2.39, 2.99, 0.99};
        double sum = 0;
        for (double num : prices) {
            sum += num;
        }

        System.out.println(sum + " € " + Arrays.toString(products));
        return product;
    }

}
/*
Задача 2
Давайте создадим класс Product. Пусть у нашего продукта будет название и цена.
Создайте в программе список из Product, и выведите его на экран, например так:
1. Хлеб 1.79
2. Молоко 1.05
3. Масло 2.39
4. Колбаса 2.99
5. Рис 0.99
Реализуйте возможность для пользователя указывать номер позиции,
 тем самым добавлять продукт в корзину. Один и тот же продукт может
  несколько раз быть добавленным в корзину. Если пользователь ввел '0'
  считаем что ввод закончен. Система должна распечатать все продукты в корзине и
  количество и сумму заказа.
 */



