package pers.java.weather;

public class Weather {
	private int temperture;
	private int humidity;
	private boolean flag = false;
	public int getTemperture() {
		return temperture;
	}
	public void setTemperture(int temperture) {
		this.temperture = temperture;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	//生产天气  synchronized
	public synchronized void generate() {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		setTemperture((int)(Math.random()*40));
		setHumidity((int)(Math.random()*100));
		System.out.println("生成天气数据："+toString());
		flag = true;
		notifyAll();
	}
	//获取天气
	public synchronized void read() {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("读取天气数据："+toString());
		flag = false;
		notifyAll();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[温度："+temperture+",湿度："+humidity+"]";
	}
}

