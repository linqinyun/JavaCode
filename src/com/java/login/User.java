package com.java.login;

public class User {
	private String account;
	private String password;
	{
		//构造代码块
		System.out.println("我是构造代码块");
	}
	public User() {
		
	}
	public User(String account, String password) {
		this.setAccount(account);
		this.setPassword(password);
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
