package com.mayto.dbwithjpahibernate;

import com.mayto.dbwithjpahibernate.domain.Author;
import com.mayto.dbwithjpahibernate.domain.Book;

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
//                .id(3L)
                .name("mayra torres B")
                .age(26)
                .build();
    }

    public static Author createTestAuthorB() {
        return new Author.Builder()
//                .id(4L)
                .name("autor B")
                .age(32)
                .build();
    }
    public static Author createTestAuthorC() {
        return new Author.Builder()
//                .id(5L)
                .name("mayra torres E")
                .age(26)
                .build();
    }

    public static Book createTestBook(Author author) {
        return new Book.Builder()
                .isbn("978-123-453-4543")
                .title("IT")
                .author(author)
                .build();
    }

    public static Book createTestBookA(Author author) {
        return new Book.Builder()
                .isbn("978-123-453-4541")
                .title("IT")
                .author(author)
                .build();
    }

    public static Book createTestBookB(Author author) {
        return new Book.Builder()
                .isbn("978-123-453-4542")
                .title("IT")
                .author(author)
                .build();
    }

    public static Book createTestBookC(Author author) {
        return new Book.Builder()
                .isbn("978-123-453-4544")
                .title("IT")
                .author(author)
                .build();
    }
}
