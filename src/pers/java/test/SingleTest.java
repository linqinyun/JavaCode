package pers.java.test;

import pers.java.single.Single;
import pers.java.single.SingleTwo;
import pers.java.singleEarth.Earth;
import pers.java.singleEarth.Emperor;

public class SingleTest {
	public static void main(String[] args) {
//		Single one = Single.getInstance();
//		Single two = Single.getInstance();
//		System.out.println(one==two);
//		SingleTwo st1 = SingleTwo.getInstance();
//		SingleTwo st2 = SingleTwo.getInstance();
//		System.out.println(st1==st2);
//		System.out.println("第一个地球创建中。。。。");
//		Earth er1 = Earth.getInstance();
//		System.out.println("第二个地球创建中。。。。");
//		Earth er2 = Earth.getInstance();
//		System.out.println("第三个地球创建中。。。。");
//		Earth er3 = Earth.getInstance();
//		System.out.println("问：三个地球是同一个么？");
//		System.out.println(er1);
//		System.out.println(er2);
//		System.out.println(er3);
		Emperor ep1 = Emperor.getInstance();
		Emperor ep2 = Emperor.getInstance();
		Emperor ep3 = Emperor.getInstance();
		System.out.println("创建1号皇帝对象");
		
		System.out.println("创建2号皇帝对象");
		
		System.out.println("创建3号皇帝对象");
		
		System.out.println("三个皇帝对象依次是：");
		System.out.println(ep1);
		System.out.println(ep2);
		System.out.println(ep3);
	}
}
