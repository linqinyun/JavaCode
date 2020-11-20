package pers.java.imst;

public class Waxberry extends Fruits{
	private String color;
	public Waxberry() {
		
	}
	public Waxberry(String shape, String taste, String color) {
		super(shape, taste);
		this.setColor(color);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public final String face() {
		String str = "waxberry, "+this.getColor()+","+this.getShape()+",the acidity is moderate";
		return str;
	}
	public void eat() {
		System.out.println("Sweet and sour bayberry, very delicious!");
	}
	public String toString() {
		return this.getShape()+"_"+this.getColor()+"_"+this.getTaste();
	}
	
}	
