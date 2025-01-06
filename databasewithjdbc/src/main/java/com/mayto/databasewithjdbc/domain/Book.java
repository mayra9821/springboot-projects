package com.mayto.databasewithjdbc.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    private String isbn;
    private String title;
    private Long authorId;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public static class Builder {
        private String isbn;
        private String title;
        private Long authorId;

        public Builder() {}

        public Builder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }
        public Builder title(String title) {
            this.title = title;
            return this;
        }
        public Builder authorId(Long authorId) {
            this.authorId = authorId;
            return this;
        }
        public Book build() {
            Book book = new Book();
            book.setIsbn(isbn);
            book.setTitle(title);
            book.setAuthorId(authorId);
            return book;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn) &&
                Objects.equals(title, book.title) &&
                Objects.equals(authorId, book.authorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, authorId);
    }
}
