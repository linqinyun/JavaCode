package pers.java.test;

import pers.java.car.Car;
import pers.java.car.HomeCar;
import pers.java.car.Taxi;

public class CarTest {
	public static void main(String[] args) {
		Car cr1 = new Car("red","H");
		Car cr2 = new Car("red","H");
		cr1.use();
		System.out.println(cr1.equals(cr2));
		System.out.println("==================================");
		Taxi ti = new Taxi("green","W","WS");
		System.out.println(ti.ride());
		ti.use();
		System.out.println(ti.toString());
		System.out.println("==================================");
		HomeCar hc = new HomeCar("yellow","T",3);
		hc.display();
		hc.display(20);
	}
}
