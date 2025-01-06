package com.mayto.databasewithjdbc.dao;

import com.mayto.databasewithjdbc.domain.Book;

import java.util.List;

public interface BookDao {
    void create(Book book);

    List<Book> find();

    void update(String isbn, Book book);

    void delete(long id);
}
