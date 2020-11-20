package pers.java.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat("小猫1",12,"白尾");
		Cat cat2 = new Cat("小猫2",8,"黑尾");
		Cat cat3 = new Cat("小猫3",7,"黄尾");
		
		Set<Cat> set = new HashSet<Cat>();
		set.add(cat1);
		set.add(cat2);
		set.add(cat3);
		
		Iterator<Cat> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("===================");
		System.out.println("插入重复信息");
		Cat cat4 = new Cat("小猫1",12,"白尾");
		set.add(cat4);
		it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("===================");
		System.out.println("插入new信息");
		Cat cat5 = new Cat("小猫4",16,"灰尾");
		set.add(cat5);
		it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//查找
		System.out.println("===================");
		if(set.contains(cat1)) {
			System.out.println(cat1);
		}else {
			System.out.println("no");
		}
		System.out.println("===================");
		boolean flag = false;
		Cat c = null;
		it = set.iterator();
		while(it.hasNext()) {
			c = it.next();
			if(c.getName().equals("小猫1")) {
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println(c);
		else
			System.out.println("no");
		
		System.out.println("===================");
		
		//删除信息
//		for(Cat cat:set) {
//			if("小猫3".equals(cat.getName())) {
//				set.remove(cat);break;
//			}
//		}
		Set<Cat> st1 = new HashSet<Cat>();
		for(Cat cat:set) {
			if(cat.getMonth()<12) {
				st1.add(cat);
			}
		}
		set.removeAll(st1);
		System.out.println("delete");
		for(Cat cat:set) {
			System.out.println(cat);
		}
		
		System.out.println("===================");
		
		boolean flag1 = set.removeAll(set);
		
		if(flag1)
			System.out.println("miao bu jian le");
		else
			System.out.println("miao hai zai");
		
		
	}

}
