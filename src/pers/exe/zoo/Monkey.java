package pers.exe.zoo;

public class Monkey extends Animal implements IACT {
	private String type;
	public Monkey() {
		
	}
	public Monkey(String name, int age, String type) {
		this.setName(name);
		this.setAge(age);
		this.setType(type);
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "杂耍";
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
