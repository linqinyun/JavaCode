package pers.java.poryAnimal;

public class Test {

	public static void main(String[] args) {
		// 1
//		Animal one = new Animal();
		// 2 向上转型 隐式转型 自动转型 父类引用子类实例
		// 可以调用子类重写父类的方法以及父类派生的方法，无法使用子类特有的方法属性
		Animal two = new Cat();
		// 3
		Animal three = new Dog();

//		one.eat();
		two.eat();
		three.eat();
		System.out.println("=============================");
		// 向下转型 强制类型转换
//		Cat c1 = (Cat)two;

		// instanceof 判断满足实例 true/false
		if (two instanceof Cat) {
			Cat c1 = (Cat) two;
			c1.run();
		}
		// 强制类型转换判断该 a 判断 b实例
		if (two instanceof Dog) {
			Cat c1 = (Cat) two;
			c1.run();
		}
		Animal[] animal = new Animal[5];
		int n;
		for (int i = 0; i < animal.length; i++) {
			n = (int) (Math.random() * 3);
			System.out.println(n);
			switch (n) {
			case 0:
				animal[i] = new Cat();
				break;
			case 1:
				animal[i] = new Dog();
				break;
			case 2:
				animal[i] = new Sheep();
				break;
			}
		}
		for(int i=0;i<animal.length;i++) {
			animal[i].cry();
		}
	}

}
