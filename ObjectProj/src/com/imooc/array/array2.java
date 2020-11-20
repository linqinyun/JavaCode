package com.imooc.array;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 二维数组 -- 案例
		// 声明三种形式
//		int[][] arr1;
//		float arr2[][];
//		double[] arr3[];
//		arr1 = new int[3][3];
//		char[][] ch = new char[3][3];
//		arr2 = new float[3][];
//		//注意数组下标越界
//		//二维数组初始化
//		int[][] num = {{1,2,3},{4,5,6},{7,8,9}};
//		System.out.println(num[0][1]);
		int[][] intArray = new int[3][2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				if (j == 0) {
					System.out.println("请输入第" + (i + 1) + "个学生的语文成绩");
				} else {
					System.out.println("请输入第" + (i + 1) + "个学生的数学成绩");
				}
				intArray[i][j] = sc.nextInt();
			}
		}
		int yuwenTotal = 0;
		int yuwenAvg = 0;
		int shuxueTotal = 0;
		int shuxueAvg = 0;
		for (int i = 0; i < intArray.length; i++) {
			yuwenTotal += intArray[i][0];
			shuxueTotal += intArray[i][1];
		}
		yuwenAvg = yuwenTotal/intArray.length;
		shuxueAvg = shuxueTotal/intArray.length;
		System.out.println("成绩公布");
		System.out.println(yuwenTotal);
		System.out.println(yuwenAvg);
		System.out.println(shuxueTotal);
		System.out.println(shuxueAvg);
	}

}
