package com.imooc;

public class FloatDemo {
	public static void main(String[] args) {
		float f =1234.328f;
		System.out.println(f);
		double d = 32132.324234d;
		System.out.println("d="+d);
		double d2 = d;
		System.out.println("d2="+d2);
		
		char a= 'a';
		char ch= 65535;
		char ch2 = 111;
		char ch1 = (char)65536;
		System.out.println("a="+a);
		System.out.println("ch="+ch);
		System.out.println("ch1="+ch1);
		
		char c = 's';
		System.out.println("c="+c);
		char c1 =78;
		System.out.println("c1="+c1);
		
		//Unicode 支持世界所有字符集
		char u1 ='\u005d';
		System.out.println("unicode="+u1);
		
		String str = "这是测试使用的str字符串";
		System.out.println(str);
	}
}
