package pers.java.string;

public class Demo1 {
	public static void main(String[] args) {
		String str = "Java basic demo";
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		System.out.println(str.substring(5));
		System.out.println(str.substring(0,4));
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf("basic"));
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.lastIndexOf("demo"));
	}
}
