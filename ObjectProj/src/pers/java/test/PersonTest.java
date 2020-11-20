package pers.java.test;

//import pers.java.anorymous.Man;
import pers.java.anorymous.Person;
//import pers.java.anorymous.Woman;

public class PersonTest {
//	public void getRead(Man man) {
//		man.read();
//	}
//	public void getRead(Woman woman) {
//		woman.read();
//	}
	public void getRead(Person person) {
		person.read();
	}
	public static void main(String[] args) {
		PersonTest personTest = new PersonTest();
//		Man man= new Man();
//		Woman woman = new Woman();
//		personTest.getRead(man);
//		personTest.getRead(woman);
		
		personTest.getRead(new Person() {
			@Override
			public void read() {
				// TODO Auto-generated method stub
				System.out.println("男生喜欢看科幻类的书籍");
			}
		});
		
	}
}
