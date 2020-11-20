package pers.java.carAdmin;

public class Tricycle extends NonMotor{
	public Tricycle() {
		super.setWheel(3);
	}
	public String work() {
		String str = "三轮车是一款有"+this.getWheel()+"个轮子的非机动车。";
		return str;
	}
}
