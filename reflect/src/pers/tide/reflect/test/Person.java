package pers.tide.reflect.test;
/**
 * person
 * @author ZHR
 *
 */
public class Person {
	private String name;
	private String sex;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	public void eat() {
		System.out.println("this is the act of eating");
	}
}
