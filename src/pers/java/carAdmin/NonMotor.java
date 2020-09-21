package pers.java.carAdmin;

public class NonMotor {
	private String name;
	private String color;
	private int wheel = 2;
	private int seat = 1;

	public NonMotor() {

	}

	public NonMotor(String name, String color) {
		this.setName(name);
		this.setColor(color);
	}

	public NonMotor(String name, String color, int wheel, int seat) {
		this.setName(name);
		this.setColor(color);
		this.setWheel(wheel);
		this.setSeat(seat);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public String work() {
		String str = "这是一辆" + this.getColor() + "颜色的，" + this.getName() + "牌的非机动车，有" + this.getWheel() + "的轮子，有"
				+ this.getSeat() + "个座椅的非机动车。";
		return str;
	}
	
	public NonMotor create() {
		return new NonMotor();
	}
}
