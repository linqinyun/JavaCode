package com.java.animal;

import com.java.test.Monkey;
import com.java.test.Person;

public class CatTest {
	//单一责任原则
	public static void main(String[] args) {
//		Cat one = new Cat();
//		one.run();
//		one.name = "test";
		Person ps = new Person("小明",10,"五");
		ps.student();
		ps.sex("男");
		ps.mySelf();
		System.out.println("====================");
		Monkey mk = new Monkey();
		System.out.println("名称："+mk.name);
		System.out.println("特征："+mk.feature);
		System.out.println("====================");
		Monkey mks = new Monkey("白头叶猴","头上有白毛，喜欢吃树叶");
		System.out.println("名称："+mks.name);
		System.out.println("特征："+mks.feature);
	}
}
