package pers.java.Ball;

public class Test {
	public static void main(String[] args) {
		BallTest.Inner_m innerm = new BallTest().new Inner_m();
		innerm.paly();
		BallTest test = new BallTest();
		test.info();
		test.palyBall(new Ball() {
			@Override
			public void paly() {
				// TODO Auto-generated method stub
				System.out.println("**********");
				System.out.println("匿名内部类:");
				System.out.println("打排球");
			}
		});
	}
}
