package app;

public class BookArray {
    private Book[] arr;

    public BookArray(Book[] arr) {
        this.arr = arr;

    }
    public String toString() {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] + "\n";
        }
        return result;
    }
}
