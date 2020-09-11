package com.java.test;

public class Monkey {
	public String name;
	public String feature;
	public Monkey() {
		this.name = "长尾猴";
		this.feature = "尾巴长";
		System.out.println("我是使用无参构造产生的猴子：");
	}
	public Monkey(String name,String feature) {
		this.name = name;
		this.feature = feature;
		System.out.println("我是使用带参构造产生的猴子：");
	}
	
}
