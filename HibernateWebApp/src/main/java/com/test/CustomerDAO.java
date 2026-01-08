package com.test;
 
import java.util.List;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
import jakarta.persistence.Query;
 
public class CustomerDAO {
	public static Customer getCustomerById(int input)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		String hql = "from Customer where id = :id";
		
		Query query = session.createQuery(hql,Customer.class);
		
		query.setParameter("id", input);
		
		System.out.println("Customer ID : " + input);
		
		List<Customer> list = query.getResultList();
		
		t.commit();
		
		session.close();
		
		Customer dt = new Customer(input);
		for(Customer ct : list) {
			System.out.println(ct);
			dt = ct;
		}
		return dt;
	}
	
	public static void addCustomer(Customer cst)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		session.persist(cst);
		
		t.commit();
		
		session.close();
	}
	
	public static int deleteCustomer(int id)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		String hql = "delete from Customer c where c.id = :id";
		
		Query query = session.createQuery(hql);
		
		query.setParameter("id", id);
		
		query.executeUpdate();
		t.commit();
		
		System.out.println("Deleted Customer ID : " + id);
		
		
		
//		Customer cst = new Customer();
//		session.persist(cst);
		
//		t.commit();
		
		return id;
	}
	
	public static List<Customer> ViewCustomer()
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		String hql1 = "Select c from Customer c";
		
		Query query1 = session.createQuery(hql1,Customer.class);
		
		List<Customer> list1 = query1.getResultList();
		
		for (Customer c : list1) {
			System.out.println(c.getFirstName());
		}
		

		System.out.println("Customers count: " + list1.size());
		for (Customer c : list1) {
		    System.out.println(c.getFirstName());
		}
		return list1;
	}
}