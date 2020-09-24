package pers.java.Ball;

public class BallTest {
	public BallTest() {
		
	}
	public void palyBall(Ball ball) {
		ball.paly();
	}
	public Inner_m getInnerM() {
		return new Inner_m();
	}
	//成员内部类
	class Inner_m implements Ball{
		@Override
		public void paly() {
			// TODO Auto-generated method stub
			System.out.println("成员内部类：");
			System.out.println("打篮球");
		}
	}
	//方法内部类
	public Object info() {
		class Inner_m implements Ball{
			@Override
			public void paly() {
				// TODO Auto-generated method stub
				System.out.println("**********");
				System.out.println("方法内部类:");
				System.out.println("打乒乓球");
			}
		}
		new Inner_m().paly();
		return null;		
	}
}
