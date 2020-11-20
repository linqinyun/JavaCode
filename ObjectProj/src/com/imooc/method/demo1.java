package com.imooc.method;

public class demo1 {
	/*
	 * 无参无返回值
	 */
	public void printStr() {
		System.out.println("******************");
		System.out.println("Java");
		System.out.println("******************");
	}

	/*
	 * 无参有返回值
	 */
	public int area() {
		int length = 10;
		int width = 2;
		int getArea = length * width;
		return getArea;
	}

	/*
	 * 有参无返回值 求两个float类型数据最大值的方法，方法内打印输出
	 */
	public void max(float a, float b) {
		if (a > b) {
			System.out.println(a);
		} else if (a == b) {
			System.out.println("相等");
		} else {
			System.out.println(b);
		}
	}

	/*
	 * 有参有返回值
	 */
	public int[] bubbleSort(int[] array) {
		int[] a = new int[3];
		return a;
	}

	/**
	 * 商品打折
	 * 
	 * @param price
	 */
	public void discount(float price) {
		float discountRate = price;
		if (price < 100) {
			discountRate = price;
		} else if (price >= 100 && price <= 199) {
			discountRate = price * 0.95f;
		} else if (price >= 200) {
			discountRate = price * 0.85f;
		}
		System.out.println("打折后的商品价格为：" + discountRate);
	}

	/**
	 * 定义一个求n!的方法
	 * 
	 * @param n
	 * @return s
	 */
	public int fac(int n) {
		int s = 1;
		for (int i = 1; i <= n; i++) {
			s *= i;
		}
		return s;
	}

	/**
	 * 打印输出数组元素的值
	 * 
	 * @param arr
	 */
	public void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

	/**
	 * 求数组平均值
	 * 
	 * @param arr
	 * @return
	 */
	public float average(int[] arr) {
		float sum = 0;
		float avaerage;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avaerage = sum / arr.length;
		return avaerage;
	}

	/**
	 * 判断元素在数组中存在
	 * 
	 * @param n
	 * @param arr
	 * @return
	 */
	public boolean search(int n, int[] arr) {
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				flag = true;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 方法
		// 无参无返回值-无参有返回值-有参无返回值-有参有返回值
		// 无参无返回值
		demo1 de = new demo1();
		de.printStr();
		int area = de.area();
		de.max(1.23f, 3.45f);
		de.discount(150);
		int res = de.fac(10);
		int[] arr = { 1, 2, 4, 5, 6, 7, 8 };
		de.printArray(arr);
		float avaer = de.average(arr);
		boolean flag = de.search(2, arr);
		System.out.println(flag);
		System.out.println(String.format("%.2f", avaer));
	}

}
