package pers.java.exception;

import java.util.InputMismatchException;

public class Throw {
	public static int test() throws ArithmeticException,InputMismatchException{
		int i = 1;
		int j = 1;
		int result = i/j;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			test();
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
