package pers.java.car;

public class Taxi extends Car{
	private String company;
	public Taxi() {
		
	}
	public Taxi(String color, String userName, String company) {
		super(color,userName);
		this.setCompany(company);
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public final String ride() {
		return this.getUserName()+" taxi belongs to "+this.getCompany()+" company.";
	}
	public void use() {
		System.out.println("Taxi is one of the important conditions to improve the quality of life of citizens");
	}
	public String toString() {
		return this.getColor()+"  "+this.getUserName();
	}
}
