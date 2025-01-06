package com.mayto.databaseposgresql;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
@Log
public class DatabasePosgreSqlApplication implements CommandLineRunner {

    private final DataSource dataSource;

    public DatabasePosgreSqlApplication(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static void main(String[] args) {
        SpringApplication.run(DatabasePosgreSqlApplication.class, args);
    }

    @Override
    public void run(final String... args) throws Exception {
//        log.info(
//                "Starting Database PosgreSql Application ..." + dataSource.toString()
//        );
        final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.execute("select 1");
    }

}
