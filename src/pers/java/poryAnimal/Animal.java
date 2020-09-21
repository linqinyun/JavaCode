package pers.java.poryAnimal;

public class Animal {
	private String name;
	private int month;
	public Animal() {
		
	}
	public Animal(String name, int month) {
		this.setMonth(month);
		this.setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void eat() {
		System.out.println("animals can eat");
	}
}
