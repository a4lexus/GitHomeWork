package app;
/*
Задача 1
Реализуйте класс Book (Книга) Книга должна иметь несколько атрибутов:
title (название), author (автор), genre (жанр), yearOfPublished (год издания).
Реализуйте конструктор и toString(), при необходимости геттеры и сеттеры.
*/
public class Main {
    public static void main(String[] args) {
        Book[] books = {
        new Book("Книга джунглей. ", "J.Marks ",
                "приключения. ", 2016),
        new Book("Будни зеркальщика. ", "К.Шарапов ",
                "мистика. ", 2025),
        };

    BookArray bookArray = new BookArray(books);
        System.out.println(bookArray);


    }

}