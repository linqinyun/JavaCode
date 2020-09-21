package pers.java.car;

public class HomeCar extends Car{
	private int num;
	public HomeCar() {
		
	}
	public HomeCar(String color, String userName, int num) {
		super(color,userName);
		this.setNum(num);
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void display() {
		System.out.println(this.getUserName()+" owned "+this.getColor()+" color private cars with "+this.getNum()+" seats");
	}
	public void display(int num) {
		System.out.println("Most family cars have "+num+" seats");
	}
	
}
