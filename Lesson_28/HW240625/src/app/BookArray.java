package app;

public class BookArray {
    private Book[] books;
    private int size;

    public BookArray() {
        books = new Book[5]; // начальный размер массива
        size = 0;
    }

    public void addBook(Book book) {
        if (size == books.length) {
            Book[] newBooks = new Book[books.length * 2];
            System.arraycopy(books, 0, newBooks, 0, books.length);
            books = newBooks;
        }
        books[size++] = book;
    }

    public void printAllBooks() {
        for (int i = 0; i < size; i++) {
            books[i].printInfo();
        }
    }
}
