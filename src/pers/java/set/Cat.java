package pers.java.set;

public class Cat {
	private String name;
	private int month;
	private String species;
	
	public Cat(String name, int month, String species) {
		super();
		this.name = name;
		this.month = month;
		this.species = species;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", month=" + month + ", species=" + species + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + month;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((species == null) ? 0 : species.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj.getClass() == Cat.class) {
			Cat cat = (Cat)obj;
			return cat.getName().equals(name)&&(cat.getMonth() == month)&&(cat.getSpecies().equals(species));
		}
		return false;
	}
	
	
	
	
	
}
