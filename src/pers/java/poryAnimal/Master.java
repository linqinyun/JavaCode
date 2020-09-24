package pers.java.poryAnimal;

public class Master {
	public void feed(Cat cat) {
		cat.eat();
		cat.palyBall();
	}
	public void feed(Dog dog) {
		dog.eat();
		dog.sleep();
		
	}
	
	public void feed(Animal obj) {
		obj.eat();
		if(obj instanceof Cat) {
			Cat tmp = (Cat)obj;
//			tmp.eat();
			tmp.palyBall();
		}else if(obj instanceof Dog) {
			Dog tmp = (Dog)obj;
//			tmp.eat();
			tmp.sleep();
		}
	}
	
	public Dog hasManyTime() {
		System.out.println("not suffcient time");
		return new Dog();
	}
	public Cat hasLittleTime() {
		System.out.println("suffcient time");
		return new Cat();
	}
	public Animal raise(boolean isManyTime) {
		if(isManyTime) {
			System.out.println("not suffcient time");
			return new Dog();
		}else {
			System.out.println("suffcient time");
			return new Cat();
		}
	}
}
