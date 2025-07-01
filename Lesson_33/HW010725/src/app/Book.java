package app;


public class Book {
    private String author;
    private String title;
    private int year;


    private Book(Builder builder) {
        this.author = builder.author;
        this.title = builder.title;
        this.year = builder.year;

    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public static class Builder {
        private String author;
        private String title;
        private int year = 0;


        public Builder(String author, String title) {
            this.author = author;
            this.title = title;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Book build() {
            return new Book(this);
                }
            }

            @Override
            public String toString () {
                return "Book (" + "author='" + author + "', title='" + title + "' year=" + year + ')';
            }
        }




