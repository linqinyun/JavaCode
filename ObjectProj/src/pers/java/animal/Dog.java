package pers.java.animal;

/**
 * 狗类
 * 
 * @author ZHR
 *
 */
public class Dog extends Animal {
	private String year;

	public Dog() {
		
	}

	public Dog(String year) {
		super(year);
	}

	// 子类重写父类方法
	public void eat() {
		System.out.println("子类重写父类方法");
	}

	// 父类重载eat方法
	public void eat(String str) {
		System.out.println("子类调用父类eat方法");
		super.eat();
		System.out.println("父类重载eat方法");
	}

	public static void main(String[] args) {
		Dog dg = new Dog("12");
//		dg.eat();
//		dg.eat("1");
	}
}
