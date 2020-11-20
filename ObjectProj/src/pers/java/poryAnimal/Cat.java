package pers.java.poryAnimal;

public class Cat extends Animal{
	private double weight;
	public Cat() {
		
	}
	public Cat(String name, int month, double weight) {
		super(name,month);
		this.setWeight(weight);
	}
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public void eat() {
		System.out.println("cat eat fish");
	}
	
	public void run() {
		System.out.println("cat run");
	}
	public void palyBall() {
		// TODO Auto-generated method stub
		System.out.println("cat playBall");
		
	}
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("Cat cry miao miao miao");
	}
}
