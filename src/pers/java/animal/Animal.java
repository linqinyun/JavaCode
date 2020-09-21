package pers.java.animal;

public class Animal {
	private String name;
	protected String sex;
	public String sps;
	public Animal() {
		
	}
	public Animal(String name) {
		this.name = name;
		System.out.println("animal参数构造方法");
	}
	public void eat() {
		System.out.println("父类eat方法");
	}
	
}
