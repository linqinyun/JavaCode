package pers.java.generic;

public class TwoNumGeneric<T,X> {
	private T num1;
	private X num2;
	public void genNum(T num1,X num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public T getNum1() {
		return num1;
	}
	public void setNum1(T num1) {
		this.num1 = num1;
	}
	public X getNum2() {
		return num2;
	}
	public void setNum2(X num2) {
		this.num2 = num2;
	}
	public static void main(String[] args) {
		TwoNumGeneric<Integer,Float> numObj = new TwoNumGeneric<>();
		numObj.genNum(21, 1.2f);
		System.out.println(numObj.getNum1()+" "+numObj.getNum2());
	}
}
