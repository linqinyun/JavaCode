package pers.java.photo;

// 接口命名通常使用I开口
//接口访问为public 或者默认

//接口可以实现继承，可以继承多个父接口
public interface Iphoto extends Icamera {
	//接口中的抽象方法可以不写abstract关键词，访问修饰符默认public
	public void photo();
	void netword();
	//接口中可以包含常量， 系统自动加上 public static final
	public static final int T = 20;
	int S = 30;
	default void connection() {
		System.out.println("default method");
	}
	static void end() {
		System.out.println("end");
	}
}
