package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

@ComponentScan(basePackages = "com.test")
public class TestDemo {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		User obj = ctx.getBean("user", User.class);
		
		System.out.println(obj);
		
		ExpressionParser exp = new SpelExpressionParser();
		
//		String str = "java";
		
		Expression ex = exp.parseExpression("'This is simple SpEL literal example'");
		String str = ex.getValue(String.class);
		System.out.println("Literal Expression : " + str);
		
		Expression ex1 = exp.parseExpression("'Simple SpEL mla bangalore'".toUpperCase());
		String upr = ex1.getValue(String.class);
		System.out.println("String Uppercase Method : " + upr);
		
		Expression ex2 = exp.parseExpression("55 * 7");
		Integer a = ex2.getValue(Integer.class);
		System.out.println("Numerical Data : " + a);
		
		
	}

}
