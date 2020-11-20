package pers.java.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		set.add("blue");
		set.add("red");
		set.add("black");
		set.add("yellow");
		set.add("white");
		
		System.out.println("===========");
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
//		set.add("green");
	}

}
