package app;




/*
Задача 1
Реализуйте класс Book (Книга) Книга должна иметь несколько атрибутов: title (название), author (автор), genre (жанр), yearOfPublished (год издания).
Реализуйте конструктор и toString(), при необходимости геттеры и сеттеры
Задача 2
Реализуйте класс BookArray, который управляет массивом книг. Класс должен похволять

вывести все книги на экран
вывести на экран все книги данного автора
ответит есть ли книга с заданным названием в массиве
 */


import java.util.Scanner;

    public class Homework {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            Book[] books = {
                    new Book("Гарри Поттер и Философский камень", "Джоан Роулинг", "Фантастика", 1997),
                    new Book("Гарри Поттер и Тайная комната", "Джоан Роулинг", "Фантастика", 1998),
                    new Book("Властелин Колец", "Дж. Р. Р. Толкин", "Фэнтези", 1954),
                    new Book("1984", "Джордж Оруэлл", "Антиутопия", 1949)

            };
           // BookArray bookArray = new BookArray(books)
            BookArray bookArray = new BookArray();

            bookArray.add(new Book("Задача трех тел", "Лю Цысинь", "Научная фантастика", 2006));
            bookArray.add(new Book("Марсианин", "Энди Вейер", "Научная фантастика", 2011));
            bookArray.add(new Book("Автостопом по галактике", "Дуглас Адамс", "Научная фантастика", 1979));
            bookArray.add(new Book("Убийство в восточном экспрессе", "Агата Кристи", "Детектив", 1934));


            System.out.println("Список всех книг:");
            System.out.println(bookArray);

            System.out.println("\nПоиск по автору:\n" + getBooksByAuthor(scanner, bookArray));
            System.out.println("\nПроверка наличия книги:");
            hasBookByTitle(scanner, bookArray);

// SOLID
        }

        public static void hasBookByTitle(Scanner scanner, BookArray bookArray){
            System.out.println("Есть ли книга которая называется?");
            String inputTitle = scanner.nextLine().trim();
            boolean result = bookArray.isBookByTitleExists(inputTitle);
            if (result) {
                System.out.println("Такая книга есть!");
            } else {
                System.out.println("Такой книги нет.");
            }
        }

        public static String getBooksByAuthor(Scanner scanner, BookArray bookArray) {
            System.out.println("Введите автора книги:");
            String inputAuthor = scanner.nextLine();
            String result = bookArray.getBooksByAuthor(inputAuthor);
            if (result.isEmpty()) {
                return "Нет книг с таким автором!";
            } else {
                return result;
            }
        }

    }


