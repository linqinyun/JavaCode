package pers.java.poryAnimal;
// abstract 抽象类 不允许实例化 可以向上转型，使用抽象类中的方法
public abstract class Animal {
	private String name;
	private int month;
	private String kind;
	public Animal() {
		
	}
	public Animal(String name, int month) {
		this.setMonth(month);
		this.setName(name);
	}
	public Animal(String kind) {
		this.setKind(kind);
	}
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	// 父类抽象方法，子类必须实现父类抽象方法
	//不允许包含方法体
	//不能重写的 修饰符  static final private
	public abstract void eat();
	public void cry() {
		
	}
}
