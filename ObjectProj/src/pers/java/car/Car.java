package pers.java.car;

public class Car {
	private String color;
	private String userName;
	public Car() {
		
	}
	public Car(String color, String userName) {
		this.setColor(color);
		this.setUserName(userName);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void use() {
		System.out.println("I'm car");
	}
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		Car ca = (Car)obj;
		if((this.getColor().equals(ca.getColor())) && (this.getUserName().equals(ca.getUserName())))
			return true;
		else
			return false;
	}
}
