package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class HQLTest {
	
	public static void main(String[] args) {
		
		// Create Configuration object
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		String hql = "select b.b_name from Book b";
		
		Query query = session.createQuery(hql);
		
		List list = query.getResultList();
		
		System.out.println(list);
		
		session.close();
	}

}
