package pers.java.people;

public class Person {
	int age;

	public Heart getHeart() {
		new Heart().temp = 12;
		return new Heart();
	}
	public void eat() {
		System.out.println("外部eat");
	}
	/**
	 * 无法直接实例化
	 * @author ZHR
	 *内部类的访问修饰符，注意访问范围
	 *内部类可以直接访问外部类的成员，如果出现同名属性，优先访问内部类中的定义的
	 */
	class Heart {
		int temp;
		public void eat() {
			System.out.println("内部eat");
		}
		public String beat() {
			eat();
			Person.this.eat();
			return Person.this.age+"beats";
		}
	}
	
	
}
