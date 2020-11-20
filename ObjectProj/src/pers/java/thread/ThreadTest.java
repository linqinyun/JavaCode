package pers.java.thread;

class MyThread extends Thread{
	public void run() {
		System.out.println(getName()+"该线程正在执行!");
	}
}

public class ThreadTest {
	
	public static void main(String[] args) {
		System.out.println("主线程1");
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();
		mt.start();
		System.out.println("主线程2");
	}

}
