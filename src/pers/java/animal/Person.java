package pers.java.animal;
//final 该类没有子类
//final 方法 方法不能被重写，不影响使用
//final	变量赋值后，无法改变
//final 成员属性，只能在构造方法与构造代码块赋值--构造过程初始化

//注解
public class Person {
	private String name;
	private int age;
	private String sex;
	public static final int temp = 12;
	public Person() {
		
	}
	public Person(String name, int age, String sex) {
		this.setName(name);
		this.setAge(age);
		this.setSex(sex);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public String toString() {
		return "姓名："+this.getName()+" 年龄："+this.getAge()+" 性别："+this.getSex();
	}
}
