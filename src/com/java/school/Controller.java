package com.java.school;

import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Major mj = new Major();
		Student st = new Student();
		int input;
		boolean isWhile = true;
		while(isWhile) {
			System.out.println("=========================");
			System.out.println("1：录入专业信息");
			System.out.println("2：录入学生信息");
			System.out.println("3：输出专业信息");
			System.out.println("4：输出学生信息");
			System.out.println("0：EXIT退出");
			System.out.println("=========================");
			input = sc.nextInt();
			switch(input) {
			case 1:
				//录入学院信息
				System.out.println("输入专业名称");
				String mjName = sc.next();
				mj.setName(mjName);
				System.out.println("输入专业编号");
				String mjNo = sc.next();
				mj.setNO(mjNo);
				System.out.println("输入学制年限");
				int mjYear = sc.nextInt();
				mj.setYear(mjYear);
				break;
			case 2:
				//录入学生信息
				if(mj.getName() == null) {
					System.out.println("专业数据未录入!");
					break;
				}
				System.out.println("输入学生姓名");
				String stName = sc.next();
				st.setStName(stName);
				System.out.println("输入学生学号");
				String stNumber = sc.next();
				st.setStNumber(stNumber);
				System.out.println("输入学生性别");
				String stSex = sc.next();
				st.setStSex(stSex);
				System.out.println("输入学生年龄");
				String stAge = sc.next();
				st.setStAge(stAge);
				st.setStMajor(mj);
				st.setStYear(mj);
				break;
			case 3:
				//输出专业信息
				mj.getMajorInfo();
				break;
			case 4:
				st.getStudentInfo();
				//输出学生信息
				break;
			case 0:
				isWhile = false;
				System.out.println("已退出！");
				break;
			}
		}
	}

}
