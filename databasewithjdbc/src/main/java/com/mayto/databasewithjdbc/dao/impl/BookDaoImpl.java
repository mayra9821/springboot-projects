package com.mayto.databasewithjdbc.dao.impl;

import com.mayto.databasewithjdbc.dao.BookDao;
import com.mayto.databasewithjdbc.domain.Author;
import com.mayto.databasewithjdbc.domain.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class BookDaoImpl implements BookDao {

    private final JdbcTemplate jdbcTemplate;

    public BookDaoImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(Book book) {
        jdbcTemplate.update("INSERT INTO books (isbn, title, author_id) VALUES (?, ?, ?)",
                book.getIsbn(),
                book.getTitle(),
                book.getAuthorId()
        );
    }

    @Override
    public List<Book> find() {
        return jdbcTemplate.query("SELECT isbn, title, author_id FROM books",
                new BookRowMapper());
    }

    @Override
    public void update(String isbn, Book book) {
         jdbcTemplate.update("UPDATE books SET isbn = ?, title = ?, author_id = ? WHERE isbn = ?",
            book.getIsbn(), book.getTitle(), book.getAuthorId(), isbn
        );
    }

    @Override
    public void delete(long id) {
        jdbcTemplate.update("DELETE FROM authors WHERE id = ?",
                id);
    }

    public class BookRowMapper implements RowMapper<Book>{
        @Override
        public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
             return new Book.Builder()
                    .isbn(rs.getString("isbn"))
                    .title(rs.getString("title"))
                    .authorId(rs.getLong("author_id"))
                    .build();
        }
    }
}
