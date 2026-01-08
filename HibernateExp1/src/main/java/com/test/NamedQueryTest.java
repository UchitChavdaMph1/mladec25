package com.test;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;


public class NamedQueryTest {
	
	public static void main(String[] args) {
		
		// Create Configuration object
				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml");
				
				SessionFactory sf = cfg.buildSessionFactory();
				Session session = sf.openSession();
				
				/*
				TypedQuery query = session.createQuery("customQuery", Book.class);
				query.setParameter("name", "Mahabharat");
				List<Book> books = query.getResultList();
				*/
				
				Query query = session.createNamedQuery("customQuery");
				query.setParameter("name", "Mahabharat");
				
				Query query1 = session.createNamedQuery("customQueryId"); 
				query1.setParameter("id", "52");
				
				List<Book> books = query.getResultList();
				List<Book> books1 = query1.getResultList();
				
				List<List<Book>> res = Arrays.asList(books,books1);
				
				System.out.println("Named Query Result");
				System.out.println(res);
				
				session .clear();
		
	}

}
