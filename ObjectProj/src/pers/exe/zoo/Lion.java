package pers.exe.zoo;

public class Lion extends Animal implements IACT {
	private String color;
	private String sex;
	public Lion() {
		
	}
	public Lion(String name, int age, String color, String sex) {
		this.setName(name);
		this.setAge(age);
		this.setColor(color);
		this.setSex(sex);
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "钻火圈";
	}

	@Override
	public String act() {
		// TODO Auto-generated method stub
		return this.skill();
	}

	@Override
	public String love(String love) {
		// TODO Auto-generated method stub
		return love;
	}

}
