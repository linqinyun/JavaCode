package com.java.test;

public class Monkey {
	private String name;
	private String feature;
	{
		//构造代码块
		System.out.println("我是构造代码块");
	}
	public Monkey() {
		this.name = "长尾猴";
		this.feature = "尾巴长";
		System.out.println("我是使用无参构造产生的猴子：");
	}

	public Monkey(String name, String feature) {
		this.name = name;
		this.feature = feature;
		System.out.println("我是使用带参构造产生的猴子：");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}
	
}
