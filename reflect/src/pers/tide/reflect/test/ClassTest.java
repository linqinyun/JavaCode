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
	 * ���class����
	 * 1.ͨ������.class
	 * 2.����.getClass()
	 * 3.Class.forName();
	 */
	public void demo1() throws ClassNotFoundException {
		// 1.   .class
		Class class1 = Person.class;
		// 2  ͨ������
		Person person = new Person();
		Class class2 = person.getClass();
		// Class��forName���
		Class class3 = Class.forName("pers.tide.reflect.test.Person");
		
	}
}
