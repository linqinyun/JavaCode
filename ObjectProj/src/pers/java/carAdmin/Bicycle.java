package pers.java.carAdmin;

public class Bicycle extends NonMotor {
	public Bicycle() {
		
	}
	public Bicycle(String name, String color) {
		super(name,color);
	}
	@Override
	public String work() {
		String str="这是一辆"+this.getColor()+"颜色的，"+this.getName()+"牌的自行车。";
		return str;
	}
	
	@Override
	public Bicycle create() {
		// TODO Auto-generated method stub
		return new Bicycle();
	}
}
