package com.imooc;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char ch = 57;
//		int i = 1;
//		System.out.println(ch);
//		switch(i) {
//		case 1:
//			System.out.println("success");
//			break;
//		default:
//			System.out.println("default");
//		}

//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入1-7之间的数字: ");
//		int n = sc.nextInt();
//		switch (n) {
//		case 1:
//			System.out.println("星期一");
//			break;
//		case 2:
//			System.out.println("星期二");
//			break;
//		case 3:
//			System.out.println("星期三");
//			break;
//		case 4:
//			System.out.println("星期四");
//			break;
//		case 5:
//			System.out.println("星期五");
//			break;
//		case 6:
//			System.out.println("星期六");
//			break;
//		case 7:
//			System.out.println("星期天");
//			break;
//		default:
//			System.out.println("非法输入");
//			break;
//		}
		Scanner sc = new Scanner(System.in);
		String words = sc.next().toLowerCase();
		switch(words) {
		case "a":
			System.out.println("这是元音字母");
			break;
		case "e":
			System.out.println("这是元音字母");
			break;
		case "i":
			System.out.println("这是元音字母");
			break;
		case "o":
			System.out.println("这是元音字母");
			break;
		case "u":
			System.out.println("这是元音字母");
			break;
		default:
			System.out.println("非元音字母");
		}
	}

}
