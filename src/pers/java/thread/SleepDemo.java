package pers.java.thread;


class MyThreads implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=15;i++) {
			System.out.println(Thread.currentThread().getName()+"执行第"+i+"次!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Letter implements Runnable{

	char[] letter = new char[26];
	public Letter() {
		for(int i=0;i<letter.length;i++){
			letter[i]=(char)('a'+i);
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<letter.length;i++) {
			System.out.println(letter[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class SleepDemo {
	public static void main(String[] args) {
		int mianpriority = Thread.currentThread().getPriority();
		System.out.println(mianpriority);
		MyThreads mt = new MyThreads();
		Thread t = new Thread(mt);
		t.setPriority(10);
		t.start();
		System.out.println(t.getPriority());
//		Thread t1 = new Thread(mt);
//		t1.start();
//		Letter lt = new Letter();
//		Thread t = new Thread(lt);
//		t.start();
//		try {
//			t.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("主线程执行");
	}

}
