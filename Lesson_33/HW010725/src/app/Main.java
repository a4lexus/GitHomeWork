package app;

import java.util.ArrayList;
/*
HW_33_Text
1. Создайте класс Book (название, автор). Создайте ArrayList<Book>.
Добавьте туда несколько объектов.
Напишите метод `ArrayList<Book> getBook (ArrayList<Book> list, String author)`
который возвращает список книг, заданного автора.
Распечатайте его из мейна.
*/

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Book b1 = new Book.Builder("Ильф и Петров", "Золотой телёнок").year(1931).build();
        Book b2 = new Book.Builder("Ильф и Петров", "Двенадцать стульев").year(1928).build();
        Book b3 = new Book.Builder("Братья Стругацкие", "Трудно быть богом").year(1964).build();
        Book b4 = new Book.Builder("Ильф и Петров", "Одноэтажная америка").year(1936).build();
        Book b5 = new Book.Builder("Братья Стругацкие", "Пикник на обочине").year(1972).build();

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        ArrayList<Book> ilfBooks = getBook(books, "Ильф и Петров"); // Пример

        System.out.println(books);
        System.out.println("========================");
        System.out.println("Книги Ильфа и Петрова: ");
        for (Book book : ilfBooks) {
            System.out.println(book);

        }
    }

    public static ArrayList<Book> getBook(ArrayList<Book> list, String author) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : list) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

}


