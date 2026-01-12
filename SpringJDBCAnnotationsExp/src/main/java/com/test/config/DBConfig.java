package com.test.config;

import java.sql.DriverManager;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.test")
@PropertySource("classpath:database.properties")
public class DBConfig {
	
	@Autowired
	Environment environment;
	
	private final String driver = "driver";
	private final String url = "url";
	private final String user = "dbuser";
	private final String password = "dbpassword";
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		
		driverManagerDataSource.setDriverClassName(environment.getProperty(driver));
		driverManagerDataSource.setUrl(environment.getProperty(url));
		driverManagerDataSource.setUsername(environment.getProperty(user));
		driverManagerDataSource.setPassword(environment.getProperty(password));
		
		return driverManagerDataSource;
	}

}
