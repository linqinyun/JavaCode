package pers.java.imst;

public class Banana extends Fruits{
	private String varitey;
	public Banana(String shape, String taste, String varitey) {
		this.setShape(shape);
		this.setTaste(taste);
		this.setVaritey(varitey);
	}
	public String getVaritey() {
		return varitey;
	}
	public void setVaritey(String varitey) {
		this.varitey = varitey;
	}
	public void advantage() {
		System.out.println(this.getVaritey()+"Fruity "+this.getShape()+" with sweet flesh for raw food");
	}
	public void advantage(String color) {
		System.out.println(this.getVaritey()+" color is "+color);
	}
}
