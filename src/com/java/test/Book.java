package com.java.test;

public class Book {
	private String name;
	private String author;
	public String press;
	public float price;

	public Book() {

	}

	public Book(String name, String author, String press, float price) {
		this.setName(name);
		this.setAuthor(author);
		this.press = press;
		if (price < 10f) {
			System.out.println("Book must cost more than 10 yuan");
			this.price = 10f;
		} else {
			this.price = price;
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
