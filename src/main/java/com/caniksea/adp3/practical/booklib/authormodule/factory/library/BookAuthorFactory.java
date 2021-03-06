package com.caniksea.adp3.practical.booklib.authormodule.factory.library;

import com.caniksea.adp3.practical.booklib.authormodule.domain.library.BookAuthor;
import com.caniksea.adp3.practical.booklib.authormodule.util.GenericHelper;

public class BookAuthorFactory {

    /**
     * Instructions:
     *  > Do NOT modify the method signature.
     *  > bookId & authorId parameters must not be empty, null or "null"
     *
     * Tasks:
     *  > Replace the throw exception (line 20) with your attempt of the factory method. (3 mark)
     *
     * @param bookId
     * @param authorId
     * @return
     */
    public static BookAuthor buildBookAuthor(String bookId, String authorId) { // DO NOT MODIFY THIS LINE.

        String id = GenericHelper.generateRandom();

        BookAuthor  bookAuthor = new BookAuthor.Builder()
                .setAuthorId(id)
                .setAuthorId(authorId)
                .build();
        return bookAuthor;

    }
}
