package com.mayto.dbwithjpahibernate.repositories;

import com.mayto.dbwithjpahibernate.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, String> {



}
