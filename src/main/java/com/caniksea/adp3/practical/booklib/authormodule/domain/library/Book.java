package com.caniksea.adp3.practical.booklib.authormodule.domain.library;

/**
 * Instructions:
 *  > Do NOT modify class instance variable declaration.
 *
 * Tasks:
 *  > Implement class using Builder Pattern ONLY. (2 marks)
 *
 */
public class Book {

    private String id, title; // DO NOT MODIFY THIS LINE.
    private int year; // DO NOT MODIFY THIS LINE

    public Book(String id,String title,int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }

    public static class Builder{

        private String id;
        private String title;
        private int year;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;

        }

        public Builder setYear(int year) {
            this.year = year;
            return this;

        }

        public Builder copy(Book book ){

            this.id = book.id;
            this.title = book.title;
            this.year =  book.year;
            return this;
        }

        public Book buid(){
            return new Book("", "", 1);
        }
    }

}
