package pers.tide.reflect.test;

import org.junit.Test;

/**
 * 
 * @author ZHR
 *
 */
public class ClassTest {
	@Test
	/**
	 * 获得class对象
	 * 1.通过类名.class
	 * 2.对象.getClass()
	 * 3.Class.forName();
	 */
	public void demo1() throws ClassNotFoundException {
		// 1.   .class
		Class class1 = Person.class;
		// 2  通过对象
		Person person = new Person();
		Class class2 = person.getClass();
		// Class类forName获得
		Class class3 = Class.forName("pers.tide.reflect.test.Person");
		
	}
}
