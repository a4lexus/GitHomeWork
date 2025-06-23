package app;

public class Book {
     String title; // название книги
     String author; // автор книги
     String genre; // жанр книги
     int yearOfPublished; // год издания

    public Book(String title, String author, String genre, int yearOfPublished) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.yearOfPublished = yearOfPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearOfPublished() {
        return yearOfPublished;
    }

    public String toString() {
        return "Название книги: "+ title + "Автор: " + author + "Жанр: "
                + genre + "Год издания: "+ yearOfPublished;

    }
}
