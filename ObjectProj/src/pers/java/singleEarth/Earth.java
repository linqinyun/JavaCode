package pers.java.singleEarth;

public class Earth {
	private Earth() {
		System.out.println("地球诞生");
	}
	private static Earth instance = new Earth();
	public static Earth getInstance() {
		return instance;
	}
}
