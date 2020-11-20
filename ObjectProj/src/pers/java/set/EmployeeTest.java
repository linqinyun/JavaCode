package pers.java.set;

import java.util.ArrayList;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em1 = new Employee(1,"a",1000);
		Employee em2 = new Employee(2,"b",2333);
		Employee em3 = new Employee(3,"c",4555);
		
		ArrayList emList = new ArrayList();
		emList.add(em1);
		emList.add(em2);
		emList.add(em3);
		for(int i=0;i<emList.size();i++) {
			String s = ((Employee)(emList).get(i)).getName();
			double p = ((Employee)(emList).get(i)).getSalary();
			System.out.println(s+"   "+p);
		}
	}

}
