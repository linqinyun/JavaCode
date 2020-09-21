package pers.java.poryAnimal;

public class Dog extends Animal{
	private String sex;
	public Dog() {
		
	}
	public Dog(String name,int month, String sex) {
		super(name,month);
		this.setSex(sex);
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public void eat() {
		System.out.println("dog eat meat");
	}
	public void sleep() {
		System.out.println("dog sleep");
	}
}
