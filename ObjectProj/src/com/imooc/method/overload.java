package com.imooc.method;

public class overload {
	/**
	 * 圆的面积
	 * 
	 * @param r
	 * @return
	 */
	public double area(double r) {
		double area = r * r * Math.PI;
		return area;
	}

	/**
	 * 长方形面积
	 * 
	 * @param length
	 * @param width
	 * @return
	 */
	public double area(double length, double width) {
		double area = length * width;
		return area;
	}
	/**
	 * 可变参数列表
	 * @param n
	 */
	public void sum(int...n) {
		int sum = 0;
		for(int i:n) {
			sum += i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 方法重载
		overload ol = new overload();
		double r = 4.5;
		double length = 8;
		double width = 5;
		double areaY = ol.area(r);
		double areaL = ol.area(length, width);
		System.out.println(areaY);
		System.out.println(areaL);
		ol.sum(1,2,3);

	}

}
