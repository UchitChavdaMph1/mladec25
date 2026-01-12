package com.test.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.test.Book;
import com.test.BookMapper;

@Component
public class BookDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public BookDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public boolean createBook(Book book) {
		String sql = "insert into book3(b_name, b_price) values (?,?)";
		return jdbcTemplate.update(sql, book.getB_name(), book.getB_price()) > 0;
	}
	
	public List<Book> getAllBooks() {
		String sql = "select * from book3";
		return jdbcTemplate.query(sql, new BookMapper());
	}
	
}
