package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exp1 {
	
	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/mladec";
		String user = "root";
		String pass = "root@39";
		
		// 1: load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2: establish or connection object
		Connection con = DriverManager.getConnection(url, user, pass);
		
		// 3: create a statement object
		Statement stmt = con.createStatement();
		
//		String sql = "insert into book1 values (1, 'Java', 250)";
		
//		stmt.addBatch("insert into book1 values (2, 'Spring', 300)");
//		stmt.addBatch("insert into book1 values (3, 'Angular', 150)");
//		stmt.addBatch("insert into book1 values (4, 'Java', 200)");
		
//		stmt.addBatch("update book1 set b_name = 'react' where b_id = 4");
		
//		stmt.addBatch("delete from book1 where b_id = 4");
		
		String sql = "select * from book1";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			System.out.println("ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) + ", Price: " + rs.getInt(3));
		}
		
		
		// 4: execute query
//		stmt.execute(sql);
		stmt.executeBatch();
		
		// 5: close the connection object
		con.close();
		
		System.out.println("Done.");
	}

}








