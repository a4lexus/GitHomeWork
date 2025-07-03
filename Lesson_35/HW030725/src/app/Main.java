package app;

import java.util.ArrayList;
import java.util.List;

/*
Задача 1
Создайте класс книга Book (String title, String author). Создайте список из книг.
Реализуйте метод, который считает сколько раз заданная книга встречается в списке.
 */
public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("Золотой телёнок","Ильф и Петров"));
        books.add(new Book("Двенадцать стульев","Ильф и Петров"));
        books.add(new Book("Одноэтажная америка","Ильф и Петров"));
        books.add(new Book("Золотой телёнок","Ильф и Петров"));

        Book book = new Book("Золотой телёнок", "Ильф и Петров");
        int count = getBookOccurrences(books,book);
        System.out.println("Книга: '" + book.getTitle() + "' встречается " + count + " раз(а)");

    }
    public static int getBookOccurrences(List<Book> books, Book findBook){
        int counter = 0;
        for (Book book: books){
            if(book.equals(findBook)){
                counter++;
            }
        }
        return counter;
    }
}
