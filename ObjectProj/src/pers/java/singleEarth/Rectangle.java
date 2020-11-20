package pers.java.singleEarth;

public class Rectangle extends Shape{
	private int lenght;
	private int wide;
	public Rectangle() {
		
	}
	public Rectangle(int lenght, int wide) {
		this.setLenght(lenght);
		this.setWide(wide);
	}
	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getWide() {
		return wide;
	}

	public void setWide(int wide) {
		this.wide = wide;
	}

	public void area() {
		int area = this.getLenght()*this.getWide();
		System.out.println("area:"+area);
	}
}
