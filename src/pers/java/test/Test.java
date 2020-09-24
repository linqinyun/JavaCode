package pers.java.test;

import pers.java.singleEarth.Balloon;
import pers.java.singleEarth.Bird;
import pers.java.singleEarth.Circle;
import pers.java.singleEarth.Plane;
import pers.java.singleEarth.Rectangle;

public class Test {
	public static void main(String[] args) {

		Rectangle rg = new Rectangle(3,4);
		rg.area();
		Circle cc = new Circle(2);
		cc.area();
		Balloon bl = new Balloon();
		bl.fly();
		Plane pe = new Plane();
		pe.fly();
		Bird bd = new Bird();
		bd.fly();
	}
}
