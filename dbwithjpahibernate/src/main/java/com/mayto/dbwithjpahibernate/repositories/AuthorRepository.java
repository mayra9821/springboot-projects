package com.mayto.dbwithjpahibernate.repositories;

import com.mayto.dbwithjpahibernate.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
