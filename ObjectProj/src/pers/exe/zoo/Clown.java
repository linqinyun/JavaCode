package pers.exe.zoo;

public class Clown implements IACT {
	private String name;
	private int years;
	public Clown() {
		
	}
	public Clown(String name, int year) {
		this.setName(name);
		this.setYears(year);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "丢火瓶";
	}

	@Override
	public String act() {
		// TODO Auto-generated method stub
		return this.skill();
	}
	public String dress(String dress) {
		return dress;
	}

}
