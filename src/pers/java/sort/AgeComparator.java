package pers.java.sort;

import java.util.Comparator;

public class AgeComparator implements Comparator<Cat> {

	@Override
	public int compare(Cat o1, Cat o2) {
		int age1 = o1.getMonth();
		int age2 = o2.getMonth();
		int n = age1-age2;
		return n;
	}

}
