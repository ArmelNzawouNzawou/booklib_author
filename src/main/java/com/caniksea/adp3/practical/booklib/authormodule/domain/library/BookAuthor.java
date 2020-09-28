package com.caniksea.adp3.practical.booklib.authormodule.domain.library;

/**
 * Instructions:
 *  > Do NOT modify class instance variable declaration.
 *
 * Tasks:
 *  > Implement class using Builder Pattern ONLY. (2 marks)
 *
 */
public class BookAuthor {

    private String bookId, authorId; // DO NOT MODIFY THIS LINE.

    public BookAuthor(String bookId,String authorId) {
        this.bookId = bookId;
        this.authorId = authorId;
    }

    public String getBookId() {
        return bookId;
    }

    public String getAuthorId() {
        return authorId;
    }

    @Override
    public String toString() {
        return "BookAuthor{" +
                "bookId='" + bookId + '\'' +
                ", authorId='" + authorId + '\'' +
                '}';
    }

    public static class Builder {
        private String bookId;
        private String authorId;

        public Builder setBookId(String bookId) {
            this.bookId = bookId;
            return this;
        }

        public Builder setAuthorId(String authorId) {
            this.authorId = authorId;
            return this;
        }

        public  Builder copy (BookAuthor bookAuthor){
            this.bookId =bookAuthor.bookId;
            this.authorId =bookAuthor.authorId;
            return this;

        }
         public BookAuthor build(){
            return new BookAuthor("", "");
         }


    }


}
