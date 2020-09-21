package com.java.school;

public class Student {
	private String stName;
	private String stNumber;
	private String stSex;
	private String stAge;
	private String stMajor;
	private int stYear;
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStNumber() {
		return stNumber;
	}
	public void setStNumber(String stNumber) {
		this.stNumber = stNumber;
	}
	public String getStSex() {
		return stSex;
	}
	public void setStSex(String stSex) {
		this.stSex = stSex;
	}
	public String getStAge() {
		return stAge;
	}
	public void setStAge(String stAge) {
		this.stAge = stAge;
	}
	public String getStMajor() {
		return stMajor;
	}
	public void setStMajor(Major mj) {
		this.stMajor = mj.getName();
	}
	public int getStYear() {
		return stYear;
	}
	public void setStYear(Major mj) {
		this.stYear = mj.getYear();
	}
	public void getStudentInfo() {
		if (this.stName == null | this.stMajor == null) {
			System.out.println("数据未录入");
		} else {
			System.out.println("学生信息如下：");
			System.out.println("学生姓名：" + this.stName);
			System.out.println("学生学号：" + this.stNumber);
			System.out.println("学生性别：" + this.stSex);
			System.out.println("学生年龄：" + this.stAge + "岁");
			System.out.println("所属专业：" + this.stMajor);
			System.out.println("专业年限：" + this.stYear + "年");
			System.out.println("===========================");
		}
	}
}
