package pers.java.singleEarth;

public class Circle extends Shape{
	private double r;
	public Circle() {
		
	}
	public Circle(double r) {
		this.setR(r);
	}
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public void area() {
		double area = Math.PI*this.getR()*this.getR();
		System.out.println("area:"+area);
	}
}
