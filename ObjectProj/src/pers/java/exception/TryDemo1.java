package pers.java.exception;

import java.util.InputMismatchException;

public class TryDemo1 {
	public static void main(String[] args) {
//		try {
//			int one = 12;
//			int two = 0;
//			System.out.println(one / two);
//		} catch (ArithmeticException e) {
//			System.out.println("error");
//			System.exit(1);
//		} catch (InputMismatchException e) {
//			System.out.println("error");
//		} finally {
//			System.out.println("exit");
//		}
		int result = test(5,0);
		System.out.println(result);
	}

	public static int test(int one, int two) {
		try {
			return one/two;
		} catch (ArithmeticException e) {
			System.out.println("error");
			return 0;
		} catch (InputMismatchException e) {
			System.out.println("error");
			return 0;
		} finally {
			System.out.println("exit");
		}
	}
}
