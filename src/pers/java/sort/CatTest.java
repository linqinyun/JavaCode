package pers.java.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat("huahua",12,"a1");
		Cat cat2 = new Cat("fanfna",2,"a2");
		Cat cat3 = new Cat("maomao",3,"a3");
		List<Cat> catList = new ArrayList<Cat>();
		catList.add(cat1);
		catList.add(cat2);
		catList.add(cat3);
		System.out.println("============== no sort ==================");
		for(Cat cat:catList) {
			System.out.println(cat);
		}
		System.out.println("============== name ==================");
		Collections.sort(catList, new NameComparator());
		for(Cat cat:catList) {
			System.out.println(cat);
		}
		System.out.println("============== age ==================");
		Collections.sort(catList, new AgeComparator());
		for(Cat cat:catList) {
			System.out.println(cat);
		}
	}

}
