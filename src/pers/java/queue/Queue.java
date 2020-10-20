package pers.java.queue;

public class Queue {

	private int n;
	private boolean flag = false;
	public synchronized int get() {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("消费:" + n);
		flag = false;
		notifyAll();
		return n;
	}

	public synchronized void set(int n) {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("生产:" + n);
		flag = true;
		this.n = n;
		notifyAll();
	}
	
}
