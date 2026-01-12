package com.test.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.Book;
import com.test.config.DBConfig;
import com.test.dao.BookDAO;

public class BookDemo {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DBConfig.class);
		
		BookDAO bdao = ctx.getBean(BookDAO.class);
		
		Book b1 = new Book();
		
		b1.setB_name("Mahabharat");
		b1.setB_price(111111);
		
		bdao.createBook(b1);
		
		List<Book> listBooks = bdao.getAllBooks();
		listBooks.forEach(System.out::println);
		
	}

}
