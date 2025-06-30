package app;

import java.util.Scanner;

public class BookArray {
    private Book[] books;
    private int size = 0;
    private  int capacity = 5;
    /*
    public BookArray(Book[] books) {
        this.books = books;
    }
*/
    public BookArray (){
        books = new Book[capacity];
    }
    public void add(Book book) {
        if (size < books.length) {
            enlarge();
        }
        books[size] = book;
        size++;
    }
        private void enlarge() {
            Book[] newArray = new Book[books.length*2];

            for (int i = 0; i < books.length; i++) {
                newArray[i] = books[i];
            }
            books = newArray;

        }

    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += "Книга " +(i+1) +" "+ books[i]
                    + "\n=========================================================================\n";
        }
        return result;
    }
    public String getBooksByAuthor(String inputAuthor) {
        String result = "";
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(inputAuthor)) {
                result += books[i] +  "\n===================================================================\n" ;
            }
        }
        return result;
    }
    public boolean isBookByTitleExists(String inputTitle){
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(inputTitle)) {
                return true;
            }
        }
        return false;
    }




}
