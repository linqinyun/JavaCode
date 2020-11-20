package pers.java.weather;

public class ReadWeather implements Runnable {
	Weather weather;
	ReadWeather(Weather weather){
		this.weather = weather;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<500;i++){	
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			weather.read();
		}
		
	}

	
}
