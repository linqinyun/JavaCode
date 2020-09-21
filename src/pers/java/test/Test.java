package pers.java.test;

import com.java.test.DFrame;

import pers.java.imst.Banana;
import pers.java.imst.Fruits;
import pers.java.imst.Waxberry;

public class Test {
	public static void main(String[] args) {
//		DFrame df = new DFrame();
		Fruits fruits1 = new Fruits("circular","sweet and sour");
		Fruits fruits2 = new Fruits("circular","sweet and sour");
		fruits1.eat();
		fruits2.eat();
		System.out.println(fruits1.equals(fruits2));
		System.out.println("————————————————————————————————————————");
		Waxberry wb = new Waxberry("square","sweet","red");
		System.out.println(wb.face());
		wb.eat();
		System.out.println(wb.toString());
		System.out.println("————————————————————————————————————————");
		Banana be = new Banana("square","sweet","tide");
		be.advantage();
		be.advantage("green");
	}
}
