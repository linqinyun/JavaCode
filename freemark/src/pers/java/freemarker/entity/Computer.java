package pers.java.freemarker.entity;

import java.util.Date;
import java.util.Map;

public class Computer {
	private String sn;
	private String model;
	private int state;
	private String user;
	private Date dop;
	private Float price;
	private Map info;
	public Computer() {
		// TODO Auto-generated constructor stub
	}
	public Computer(String sn, String model, int state, String user, Date dop, Float price, Map info) {
		this.sn = sn;
		this.model = model;
		this.state = state;
		this.user = user;
		this.dop = dop;
		this.price = price;
		this.info = info;
	}

	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Date getDop() {
		return dop;
	}
	public void setDop(Date dop) {
		this.dop = dop;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Map getInfo() {
		return info;
	}
	public void setInfo(Map info) {
		this.info = info;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
}
