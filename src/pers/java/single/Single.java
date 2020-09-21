package pers.java.single;

/**
 * 单例
 * 
 * @author ZHR 
 * 饿汉式 ：创建对象实例时直接初始化
 * 空间换时间
 */
public class Single {
//	1. 创建类中私有构造
	private Single() {

	}

//	2.创建该类型的私有静态实例
	private static Single instance = new Single();

//	3. 创建公有静态方法返回静态实例对象
	public static Single getInstance() {
		return instance;
	}
}
