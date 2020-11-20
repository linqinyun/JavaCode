package com.java.school;

public class Major {
	private static String name;
	private static String NO;
	private static int year;

	public Major() {

	}

	public Major(String name, String NO, int year) {
		this.setName(name);
		this.setNO(NO);
		this.setYear(year);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNO() {
		return NO;
	}

	public void setNO(String nO) {
		this.NO = nO;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void getMajorInfo() {
		if (name == null) {
			System.out.println("数据未录入");
		} else {
			System.out.println("专业信息如下：");
			System.out.println("专业名称：" + this.name);
			System.out.println("专业编号：" + this.NO);
			System.out.println("学制年限：" + this.year + "年");
			System.out.println("===========================");
		}

	}

}
