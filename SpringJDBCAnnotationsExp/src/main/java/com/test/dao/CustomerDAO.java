package com.test.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.test.model.Customer;
import com.test.model.CustomerMapper;

@Component
public class CustomerDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public CustomerDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	private final String insert_sql = "insert into customer1 (id, firstName, lastName, location) values (?,?,?,?)";

	private final String update_sql = "update customer1 set firstName=?, lastName=?, location=? where id=?";
	
	private final String delete_sql = "delete from customer1 where id = ?";
	
	private final String get_all_sql = "select * from customer1";
	
	public boolean createCustomer(Customer obj) {
		return jdbcTemplate.update(insert_sql, obj.getId(), obj.getFirstName(), obj.getLastName(), obj.getLocation()) > 0;
	}
	
	public boolean updateCustomer(Customer obj) {
		return jdbcTemplate.update(update_sql, obj.getFirstName(), obj.getLastName(), obj.getLocation(), obj.getId()) > 0;
	}
	
	public boolean deleteCustomer(Customer obj) {
		return jdbcTemplate.update(delete_sql,  obj.getId()) > 0;
	}
	
	public List<Customer> getAllCustomers() {
		return jdbcTemplate.query(get_all_sql, new CustomerMapper());
	}

}
