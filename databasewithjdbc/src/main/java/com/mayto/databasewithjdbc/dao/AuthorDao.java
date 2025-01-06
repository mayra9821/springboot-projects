package com.mayto.databasewithjdbc.dao;

import com.mayto.databasewithjdbc.domain.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorDao {
    void create (Author author);

    Optional<Author> findOne(long authorId);

    List<Author> find();

    void update(Author author);
}
