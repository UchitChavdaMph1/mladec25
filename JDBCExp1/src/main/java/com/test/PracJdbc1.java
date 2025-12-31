package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PracJdbc1 {
	
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
		
//		String sql = "create table book2 (b_id int, b_name varchar(50), b_author varchar(50), b_type varchar(50), b_price int)";
		
//		stmt.addBatch("insert into book2 values (1, 'Angular', 'abc', 'triology', 150)");
//		stmt.addBatch("insert into book2 values (2, 'Spring', 'def', 'biiology', 300)");
//		stmt.addBatch("insert into book2 values (3, 'React', 'ghi', 'single', 250)");
//		stmt.addBatch("insert into book2 values (4, 'Java', 'jkl', 'triology', 200)");
//		stmt.addBatch("insert into book2 values (5, 'python', 'mno', 'biology', 350)");
//		stmt.addBatch("insert into book2 values (6, 'Java', 'pqr', 'triology', 300)");
		
//		stmt.addBatch("update book2 set b_name = 'Python' where b_id = 5");
		
//		stmt.addBatch("delete from book2 where b_id = 6");
		
		String sql = "select * from book2";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		System.out.println("b_id\tb_name\tb_author\tb_type\tb_price");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" +  rs.getString(3) + "\t" +  rs.getString(4) + "\t" +  rs.getInt(5));
		}
		
		
		// 4: execute query
//		stmt.execute(sql);
		stmt.executeBatch();
		
		// 5: close the connection object
		con.close();
		
		System.out.println("Done.");
	}

}








