package pers.tide.reflect.demo;

public class Goods {
	private int id = 1;
	private String name = "isTest";
	private float price = 1.13f;
	private String desc = "test";
	public Goods(int id, String name, float price, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.desc = desc;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + ", desc=" + desc + "]";
	}
	public void display() {
		System.out.println(name);
	}
	
}
