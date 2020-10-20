package pers.java.runnable;
class PrintRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 1;
		while(i<10)
		System.out.println(Thread.currentThread().getName()+"正在运行"+(i++));
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintRunnable mt1 = new PrintRunnable();
		Thread t1 = new Thread(mt1);
		t1.start();
		
	}

}
