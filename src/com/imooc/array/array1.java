package com.imooc.array;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 一维数组
//		int myIntArray[];
//		myIntArray = new int[10];
//		int arr[] = {1,2};
//		int[] intArray;
//		String[] strArray;
//		intArray = new int[5];
//		strArray = new String[10];
//		//
//		float[] f = new float[4];
//		//
//		char[] ch = { 'a', 'b', 'c', 'd' };
//
////		System.out.println(intArray);
//		for (int i = 0; i < 5; i++)
//			intArray[i] = i + 1;
//
//		for (int i = 0; i < 5; i++)
//			System.out.print(intArray[i] + "  ");
		// 整型数组的累加和
//		int[] a = new int[5];
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < a.length; i++) {
//			System.out.println("请输入第" + (i + 1) + "个元素: ");
//			a[i] = sc.nextInt();
//		}
//		// 求数组累加和
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			sum += a[i];
//		}
//		System.out.println(sum);
//		int[] a= {1,3,6,12,15,34,654,34,76};
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%3==0) {
//				System.out.println(a[i]);
//			}
//		}
		// 数组最大值
//		int[] a= {1,3,6,12,15,34,654,34,76};
//		int max = a[0];
//		for(int i=1;i<a.length;i++) {
//			if(max<a[i]) {
//				max = a[i];
//			}
//		}
//		System.out.println(max);
		// 增强型for循环
//		int[] a= {1,3,6,12,15,34,654,34,76};
//		for(int n:a) {
//			System.out.println(n);
//		}
		char[] ch = { 'a', 'a', 'A', 'a', 'b' };
		int cNum = 0;
		for (char n : ch) {
			if (n == 'a' | n == 'A') {
				cNum++;
			}
		}
		System.out.println(cNum);
	}

}
