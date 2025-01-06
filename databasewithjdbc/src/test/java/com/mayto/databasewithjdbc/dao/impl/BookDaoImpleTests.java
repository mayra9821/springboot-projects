package com.mayto.databasewithjdbc.dao.impl;


import com.mayto.databasewithjdbc.TestDataUtil;
import com.mayto.databasewithjdbc.domain.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class BookDaoImpleTests {

    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private BookDaoImpl underTest;


    @Test
    public void testThatCreateBookGeneratesCorrectSql() {
        Book book = new Book.Builder()
                .isbn("1234")
                .title("book")
                .authorId(1L)
                .build();
        underTest.create(book);

        verify(jdbcTemplate).update(
                eq("INSERT INTO books (isbn, title, author_id VALUES (?, ?, ?)"),
                eq("1234"), eq("book"), eq(1L)
        );
    }

    @Test
    public void testThatFindGeneratesCorrectSql() {
        underTest.find();
        verify(jdbcTemplate).query(
                eq("SELECT isbn, title, author_id FROM books"),
                ArgumentMatchers.<BookDaoImpl.BookRowMapper>any()
        );
    }

    @Test
    public void testThatUpdateGeneratesCorrectSql() {
        Book book = TestDataUtil.createTestBook();
        underTest.update(book.getIsbn(), book);
        verify(jdbcTemplate).update(
                "UPDATE books SET isbn = ?, title = ?, author_id = ? WHERE isbn = ?",
                "978-123-453-4543", "IT", 1L, "978-123-453-4543"
        );
    }

    @Test
    public void testThatDeletesBookSql() {
        underTest.delete(1L);
        verify(jdbcTemplate).update(
                "DELETE FROM authors WHERE id = ?",
                1L
        );
    }
}
