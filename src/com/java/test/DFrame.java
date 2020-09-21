package com.java.test;

import javax.swing.JFrame;

public class DFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	// 构造方法
	public DFrame() {

		this.setTitle("我的第一个窗体");
		// this.setBounds(300,200,450,350);设置窗体位置大小，前两个参数为位置，后两个参数为窗体大小
		this.setLocation(300, 200);// 设置位置
		this.setSize(450, 350);// 设置大小
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置窗体关闭方式
		this.setVisible(true);// 设置为可见
	}

	public static void main(String[] args) {
		new DFrame();
	}
}
