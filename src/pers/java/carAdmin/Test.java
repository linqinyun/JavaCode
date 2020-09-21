package pers.java.carAdmin;

import pers.java.animal.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonMotor nm = new NonMotor("天宇","红色",4,2);
		Bicycle bc = new Bicycle("捷安特","黄色");
		ElectricVehicle ev = new ElectricVehicle("双飞");
		Tricycle tc = new Tricycle();
//		System.out.println(nm.work());
//		System.out.println(bc.work());
//		System.out.println(ev.work());
//		System.out.println(tc.work());
//		System.out.println(nm.toString());
		Person pers = new Person("小明",18,"男");
		System.out.println(pers.toString());
	}

}
