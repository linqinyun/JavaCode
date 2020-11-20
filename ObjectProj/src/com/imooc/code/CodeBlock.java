package com.imooc.code;

public class CodeBlock {
	{
		System.out.println("CodeBlock的构造块");
	}
	static {
		System.out.println("CodeBlock的静态代码块");
	}
	public CodeBlock() {
		System.out.println("CodeBlock的构造方法块");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("主方法");
		Code cd = new Code();
		CodeBlock cb = new CodeBlock();
	}

}
