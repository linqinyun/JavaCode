package com.imooc.school;

/**
 * 学生信息类
 * 
 * @author ZHR
 *
 */
public class Student {
	// 学号，姓名，性别，年龄
	private String studentNo;
	private String studentName;
	private String studentSex;
	private int studentAge;
	private Subject studentSubject;

	public Student() {

	}

	public Student(String studentNo, String studentName, String studentSex, int studentAge, Subject studentSubject) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentSex(studentSex);
		this.setStudentAge(studentAge);
		this.setStudentSubject(studentSubject);
		
	}
	public Student(String studentNo, String studentName, String studentSex, int studentAge) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentSex(studentSex);
		this.setStudentAge(studentAge);
		
	}
	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSex() {
		return studentSex;
	}

	public void setStudentSex(String studentSex) {
		if (studentSex.equals("女"))
			this.studentSex = studentSex;
		else
			this.studentSex = "男";
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		if (studentAge < 10 || studentAge > 100)
			this.studentAge = 18;
		else
			this.studentAge = studentAge;
	}
	
	public Subject getStudentSubject() {
		if(this.studentSubject == null)
			this.studentSubject = new Subject();
		return studentSubject;
	}

	public void setStudentSubject(Subject studentSubject) {
		this.studentSubject = studentSubject;
	}

	/**
	 * 
	 * @return
	 */
	public String introduction() {
		String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别："
				+ this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "\n所报专业：" + this.getStudentSubject().getSubjectName()
				+ "\n学制年限：" + this.getStudentSubject().getSubjectLife();
		return str;
	}

	/**
	 * 
	 * @param subjectName 专业
	 * @param subjectLife 年限
	 * @return 学生信息：姓名、学号、性别、年龄、专业、学制年限
	 */
	public String introduction(String subjectName, String subjectLife) {
		String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别："
				+ this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "\n所报专业：" + subjectName + "\n学制年限："
				+ subjectLife;
		return str;
	}

	/**
	 * 
	 * @param mySubject 专业对象
	 * @return 学生信息：姓名、学号、性别、年龄、专业、学制年限
	 */
	public String introduction(Subject mySubject) {
		String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别："
				+ this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "\n所报专业：" + mySubject.getSubjectName()
				+ "\n学制年限：" + mySubject.getSubjectLife();
		return str;
	}
}
