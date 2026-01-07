package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class BookData {
	
	public static void main(String[] args) {
		
		// Create Configuration object
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		Book obj = new Book();  // Transient State
		
		obj.setB_name("Bhagwat Geeta");
		obj.setB_author("Vasudev Shree Krishna");
		obj.setB_price(5000);
		
//		session.persist(obj);  // Persistence State
		
//		t.commit();
		
//		Book dt = session.get(Book.class, 1);
//		System.out.println("id: " + dt.getId() + "\nName: " + dt.getB_name() + "\nAuthor: " + dt.getB_author() + "\nPrice: " + dt.getB_price());
		
//		dt.setB_price(1111);
//		session.persist(dt);
//		t.commit();
		
//		System.out.println("id: " + dt.getId() + "\nName: " + dt.getB_name() + "\nAuthor: " + dt.getB_author() + "\nPrice: " + dt.getB_price());
		
		Book dt = session.get(Book.class, 102);
		
		session.remove(dt);
		t.commit();
		
		System.out.println("Done.");
		
		session.close();  // Detached State
		
	}

}
