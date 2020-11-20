package pers.java.single;

/**
 * 
 * @author ZHR
 *	懒汉式
 *类内实例对象创建时并不直接初始化，直到第一次调用get方法，才调用
 *时间换空间
 */
public class SingleTwo {
	private SingleTwo() {
		
	}
	//不直接实例化
	private static SingleTwo instance = null;
	
	public static SingleTwo getInstance() {
		if(instance==null)
			instance = new SingleTwo();
		
		return instance;
			
	}
}
