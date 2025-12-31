package com.strms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;


class Book implements Comparable<Book> {
	private int id;
	private String name;
	private int price;
	
	public Book (int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Book o) {
		return this.id = o.id;
	}
}

public class Exp1 {

	public static void main(String[] args) {
		
		List<Book> data = Arrays.asList(
				new Book(101, "java", 400),
				new Book(101, "java", 340),
				new Book(102, "php", 10),
				new Book(102, "java", 340),
				new Book(103, "python", 43),
				new Book(104, "kotlin", 25),
				new Book(105, "core java", 55)
				);
		
		Function<Book, String> fnf = Book :: getName;
		Function<Book, Integer> fni = Book :: getId;
		Function<Book, Integer> fnp = Book :: getPrice;
		
		data.stream().sorted(Comparator.comparing(fni).thenComparing(fnp).thenComparing(fnf )).forEach(System.out::println);
//		System.out.println(data.stream().sorted(Comparator.comparing(Book :: getId)));
		
		Supplier<Double> dt = () -> Math.random();
		System.out.println(dt.get());
		
		
		
		

	}

}










































