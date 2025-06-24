package app;
/*
Задача 1
По образу и подобию кода написанного на занятии, сделайте из вашего класса BookArray
(в проекте про книги) динамический массив. Т.е. ваша программа должна позволять
пользователю вводить и обрабатывать любое количество книг При выполнении данного
 задания не используйте стандартный Java класс ArrayList
 */
import java.util.Scanner;

public class BookLibrary {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BookArray library = new BookArray();


        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();

        System.out.println("Введите жанр книги ");
        String genre = scanner.nextLine();

        System.out.print("Введите автора: ");
        String author = scanner.nextLine();

        System.out.print("Введите год издания: ");
        int year = Integer.parseInt(scanner.nextLine());

        library.addBook(new Book(title, genre, author, year));

    }

  }







