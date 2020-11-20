package pers.java.exception;

import java.util.Scanner;

public class TryDemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			testAgess();
		} catch (HotelAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void testAge() {
		try {
			System.out.println("请输入年龄");
			Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();
			if (age < 18 || age > 80) {
				throw new Exception("18岁以下，80岁以上的住客必须由亲友陪同");
			} else {
				System.out.println("欢迎入住");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void testAges() throws Exception {
		System.out.println("请输入年龄");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age < 18 || age > 80) {
			throw new Exception("18岁以下，80岁以上的住客必须由亲友陪同");
		} else {
			System.out.println("欢迎入住");
		}

	}
	public static void testAgess() throws HotelAgeException{
		System.out.println("请输入年龄");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age < 18 || age > 80) {
			throw new HotelAgeException();
		} else {
			System.out.println("欢迎入住");
		}

	}

}
