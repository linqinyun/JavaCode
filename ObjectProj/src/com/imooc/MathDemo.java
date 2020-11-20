package com.imooc;

import java.util.Scanner;

public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 =10,num2 =5;
		int result;
		result = num1+num2;
		System.out.println(num1+"+"+num2+"="+result);
		//字符串的连接运算
		System.out.println(""+num1+num2);
		
		//test
		int m=10,n=5;
		m+=3;
		n+=5;
		double p = (m+n)/2;
		double q = (m*m)*(n*n);
		
		System.out.println("m+n的平均值为："+p);
		System.out.println("m的平方乘以n的平方为："+q);
		
		int a=4,b=15,c=20;
		int m1 = (b/a)+c;
		int n1 = (c%b)*a-c;
		System.out.println(""+m1+","+n1);
		
		int x= 4;
		int y = (x--)+5;
		System.out.println(""+x+","+y);
		
		if(x>y) {
			System.out.println("no");
		}else {
			System.out.println("off");
		}
		
		//键盘接受数据
//		System.out.println("请输入一个整数");
//		Scanner s = new Scanner(System.in);
//		
//		int nj = s.nextInt();
//		if(nj%2==0) {
//			System.out.println("偶数");
//		}else {
//			System.out.println("奇数");
//		}
		
		double height = 1.64,weight=60;
		double bmi = weight/(height*height);
		System.out.println(bmi);
		if(bmi >18.5 && bmi < 23.9){
		    System.out.println("正常");
		}else{
		    System.out.println("不正常");
		}
	}

}
