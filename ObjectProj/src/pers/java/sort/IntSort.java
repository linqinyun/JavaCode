package pers.java.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntSort {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5); 
		list.add(10);
		list.add(1);
		list.add(133);
		for(int n:list) {
			System.out.print(n+"  ");
		}
		Collections.sort(list);
		System.out.println();
		for(int n:list) {
			System.out.print(n+"  ");
		}
		System.out.println();
		List<String> listArr = new ArrayList<String>();
		listArr.add("as");
		listArr.add("dsfa");
		listArr.add("csv");
		listArr.add("fgh");
		
		for(String str:listArr) {
			System.out.print(str+"  ");
		}
		Collections.sort(listArr);
		System.out.println();
		for(String str:listArr) {
			System.out.print(str+"  ");
		}
	}
}	
