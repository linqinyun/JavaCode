package com.imooc;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("请输入年份：");
//		Scanner sc = new Scanner(System.in);
//		int year = sc.nextInt();
//		
//		if( (year%4 ==0 & year%100!=0) | (year%400 == 0) ) {
//			System.out.println("是闰年");
//		}else {
//			System.out.println("不是闰年");
//		}
		
//		System.out.println("请输入整数：");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		if( num%5==0 && num%7==0 ) {
//			System.out.println("yes");
//		}else {
//			System.out.println("no");
//		}
		
		int x =-5;
		int y = 0;
		if(x<0) {
			y = -1;
		}else if(x==0) {
			y= 0;
		}else if(x==1) {
			y=1;
		}
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}
