package app;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int year;

    public Book(String title, String author, String genre, int year) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;

    }
    public void printInfo() {
        System.out.println("Название: " + title + ", жанр: " + genre + ", автор: "
                + author + ", год:" + year);
    }


}
