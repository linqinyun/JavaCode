package pers.java.queue;

public class Comsumer implements Runnable{
	Queue queue;
	Comsumer(Queue queue){
		this.queue = queue;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			queue.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
