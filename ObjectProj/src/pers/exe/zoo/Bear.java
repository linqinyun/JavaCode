package pers.exe.zoo;

public class Bear extends Animal implements IACT {
	public Bear() {
		
	}
	public Bear(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "自立走秀";
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
