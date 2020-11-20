package pers.java.people;

public class Person {
	int age;

	public Heart getHeart() {
		new Heart().temp = 12;
		return new Heart();
	}
	/**
	 * 方法内部类
	 * 定义于方法中，作用范围在方法中
	 * 和方法内部成员使用规则一样，class 不添加public private protected static
	 * 类中不能包含静态成员
	 * 类中可以包含final abstract 修饰的成员
	 * @return
	 */
	public Object getHand() {
		class Hand{
			String say() {
				return "hand say";
//				System.out.println("hand say");
			}
		}
		return new Hand().say();
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
	/**
	 * 静态内部类中只能访问外部类的静态方法，如果需要调用非静态方法，可以通过对象实例
	 * 静态内部类中只能访问外部类的静态成员，如果需要调用非静态成员，可以通过对象实例
	 */
	static class Hand {
		int temp;
		public void eat() {
			System.out.println("内部eat");
		}
		public static void say() {
			System.out.println("hello");
		}
		public String beat() {
			eat();
			new Person().eat();
			return new Person().age+"beats";
		}
	}
}
