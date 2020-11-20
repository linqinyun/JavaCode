package pers.java.singleEarth;

public class Emperor {
	private Emperor() {
		
	}
	private static Emperor instance=null;
	public static Emperor getInstance() {
		if(instance==null)
			instance = new Emperor();
		return instance;
	}
}
