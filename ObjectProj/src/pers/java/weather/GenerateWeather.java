package pers.java.weather;

public class GenerateWeather implements Runnable {
	Weather weather;
	GenerateWeather(Weather weather){
		this.weather = weather;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<500;i++){	
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			weather.generate();
		}
	}
	
}
