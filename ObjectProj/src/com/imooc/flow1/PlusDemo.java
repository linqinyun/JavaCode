package com.imooc.flow1;

import java.util.Scanner;

public class PlusDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 求累加和
		int n =1;
		int sum = 0;
		while(n<6) {
			sum += n++;
		}
		System.out.println(sum);
		// 循环输出26个字母，分两行输出
//		char ch = 'a';
//		int count = 1;
//		while(ch<='z') {
//			System.out.print(ch+" ");
//			if(count%13==0) 
//			System.out.println();
//			ch++;
//			count++;
//		}

//		使用while循环求1到5的平方和。
//		int n = 1;
//		int square = 0;
//		while(n<=5) {
//			square += n*n;
//			n++;
//		}
//		System.out.println(square);

		// 猜字游戏
//		int number = (int)(Math.random()*10+1);
//		int guess;
//		System.out.println("猜一个介于1-10中间的数");
//		do {
//			System.out.println("请输入一个数");
//			Scanner sc = new Scanner(System.in);
//			guess = sc.nextInt();
//			if(guess>number) {
//				System.out.println("太大");
//			}else if(guess<number) {
//				System.out.println("太小");
//			}
//		}while(number!=guess);
//		System.out.println("猜中了 "+number);
		// for
//		int sum = 0;
//		for(int i=1;i<6;i++) {
//			 sum += i;
//		}
//		System.out.println(sum);
//		int i=0;
//		for(int j=1;j<5;j+=3) {
//			i = i+j;
//			System.out.println(i);
//		}
////		System.out.println(i);
//		编写一个程序，求出200到300之间的数，
//		且满足条件：它们三个数字之积为42，三个数字之和为12。
//		int ge, shi, bai;
//		for (int i = 200; i < 300; i++) {
//			ge = i % 10;
//			shi = i / 10 % 10;
//			bai = i / 100 % 10;
//			if ((ge * shi * bai == 42) & (ge + shi + bai == 12)) {
//				System.out.println(i);
//			}
//		}
//		int m = 1;
//		int n = 1;
//		while (m <= 4) {
//			while (n <= 4) {
//				System.out.print("*");
//				n++;
//			}
//			n = 1;
//			System.out.println();
//			m++;
//		}
//		int s=1;
//		int sum=0;
//		for(int i=1;i<=10;i++) {
//			s=1;
//			for(int j=1;j<=i;j++) {
//				s = s*j;
//			}
//			sum += s;
//		}
//		System.out.println(sum);
		//三角星号
//		for(int i=1;i<6;i++) {
//			for(int z=5-i;z>0;z--) {
//				System.out.print("  ");
//			}
//			for(int j=1;j<=2*i+1;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		//break 跳出循环
		//continue //跳过循环
		//debug 单条F6断点
	}

}
