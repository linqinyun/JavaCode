package com.imooc.method;

/**
 * 
 * @author ZHR
 * @version 1.0
 */
public class ArgsDemo {
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int plus(int a, int b) {
		System.out.println("不带可变参数调用");
		return a + b;
	}
	/**
	 * 
	 * @param a
	 * @return
	 */
	public int plus(int... a) {
		int sum = 0;
		for (int n : a) {
			sum += n;
		}
		System.out.println("带可变参数调用!");
		return sum;
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsDemo ad = new ArgsDemo();
		int sum = ad.plus(1, 2);
		System.out.println(sum);
	}

}
