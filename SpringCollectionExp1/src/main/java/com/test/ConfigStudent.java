package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigStudent {
	
	@Bean
	@Scope(scopeName = "singleton")
	public Student getSetterObj() {
		return new Student();
	}
	
	@Bean
	@Scope(scopeName = "prototype")
	public Student getConstObj() {
		List<String> skills = Arrays.asList("Strength", "Mud fight", "Mace Fight");
		return new Student(2, "Bheem", skills, "Dronacharya Gurukul");
	}

}
