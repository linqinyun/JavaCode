package com.imooc.test;

import com.imooc.school.Student;
import com.imooc.school.Subject;

public class SchoolTest {
	public static void main(String[] args) {
		Subject sub1 = new Subject("计算机科学与应用","J0001",4);
//		System.out.println(sub1.info());
//		System.out.println("====================================");
		Student sd1 = new Student("S0001", "小明", "男", 19);
		Student sd2 = new Student("S0001", "小明", "男", 19);
		Student sd3 = new Student("S0001", "小明", "男", 19);
//		System.out.println(sd1.introduction());
		System.out.println("====================================");
		sub1.addStudent(sd1);
		sub1.addStudent(sd2);
		sub1.addStudent(sd3);
		System.out.println(sub1.getStudentNum());
	}
}
