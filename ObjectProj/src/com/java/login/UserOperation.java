package com.java.login;

public class UserOperation {
	public String checkUser(User one, User two) {
		String msg;
		System.out.println("用户名："+one.getAccount());
		System.out.println("密码："+one.getPassword());
		System.out.println("用户名："+two.getAccount());
		System.out.println("密码："+two.getPassword());
		if((one.getAccount()).equals(two.getAccount()) & (one.getPassword()).equals(two.getPassword())) {
			msg = "用户名与密码一致";
		}else {
			msg = "用户名与密码不一致";
		}
		return msg;
	}
}
