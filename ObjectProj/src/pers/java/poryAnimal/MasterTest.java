package pers.java.poryAnimal;

public class MasterTest {
	public static void main(String[] args) {
		Master master = new Master();
		Cat cat = new Cat();
		Dog dog = new Dog();
		master.feed(cat);
		master.feed(dog);
		boolean isManyTime = true; 
		Animal temp;
		if(isManyTime) {
			temp = master.hasManyTime();
		}else {
			temp = master.hasLittleTime();
		}
		System.out.println(temp);
		Animal temp1;
		temp1 = master.raise(isManyTime);
	}
}
