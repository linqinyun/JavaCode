package com.java.test;

public class Person {
	public String name;
	public int age;
	public String grad;
	public Person(String name, int age, String grad) {
		this.name = name;
		this.age = age;
		this.grad = grad;
	}
	public void student() {
		System.out.println("我是一名学生");
	}

	public void sex(String sex) {
		System.out.println("我是一名" + sex + "孩");
	}

	public void mySelf() {
		System.out.println("我叫" + name + ",今年" + age + "岁了, 读小学" + grad + "年级了！");
	}
}
