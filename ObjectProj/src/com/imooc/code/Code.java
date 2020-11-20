package com.imooc.code;

public class Code {
	{
		System.out.println("Code的构造块");
	}
	static {
		System.out.println("Code的静态代码块");
	}
	public Code() {
		System.out.println("code的构造方法");
	}
}
