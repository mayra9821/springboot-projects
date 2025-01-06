package com.mayto.databasewithjdbc;

import com.mayto.databasewithjdbc.domain.Author;
import com.mayto.databasewithjdbc.domain.Book;

public final class TestDataUtil {

    public TestDataUtil() {
    }

    public static Author createTestAuthor() {
        return new Author.Builder()
                .id(1L)
                .name("mayra torres A")
                .age(26)
                .build();
    }

    public static Author createTestAuthorA() {
        return new Author.Builder()
                .id(2L)
                .name("mayra torres B")
                .age(26)
                .build();
    }

    public static Author createTestAuthorB() {
        return new Author.Builder()
                .id(3L)
                .name("mayra torres D")
                .age(26)
                .build();
    }
    public static Author createTestAuthorC() {
        return new Author.Builder()
                .id(4L)
                .name("mayra torres E")
                .age(26)
                .build();
    }

    public static Book createTestBook() {
        return new Book.Builder()
                .isbn("978-123-453-4543")
                .title("IT")
                .authorId(1L)
                .build();
    }

    public static Book createTestBookA() {
        return new Book.Builder()
                .isbn("978-123-453-4541")
                .title("IT")
                .authorId(2L)
                .build();
    }

    public static Book createTestBookB() {
        return new Book.Builder()
                .isbn("978-123-453-4542")
                .title("IT")
                .authorId(3L)
                .build();
    }

    public static Book createTestBookC() {
        return new Book.Builder()
                .isbn("978-123-453-4544")
                .title("IT")
                .authorId(4L)
                .build();
    }
}
