package pers.java.warps;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 自动装箱
//		int t1 = 2;
//		Integer t2 = t1;
//		// 2. 手动装箱
//		Integer t3 = new Integer(3);
//		// test
//		System.out.println(t1);
//		System.out.println(t2);
//		System.out.println(t3);
//		System.out.println("========================");
//		// 拆箱
//		// 1.自动拆箱
//		int t4 = t3;
//		// 2.手动拆箱
//		int t5 = t2.intValue();
//		// test
//		System.out.println(t4);
//		System.out.println(t5);
//		double t6 = t2.doubleValue();
//		System.out.println(t6);

//		int score = 100; 
//		// 创建Integer包装类对象，表示变量score1的值
//		Integer score1 = score;
//		// 将Integer包装类转换为double类型
//		double t1 = score1;
//		// 将Integer包装类转换为long类型
//		long t2 = score1;  
//		// 将Integer包装类转换为int类型
//		int t3 = score1;  
//		//打印输出
//		System.out.println(score1);
//		System.out.println(t1);
//		System.out.println(t2);
//		System.out.println(t3);
		
		int t1 = 2;
		String t2 = Integer.toString(t1);
		System.out.println(t2);
		int t3 = Integer.parseInt(t2);
		int t4 = Integer.valueOf(t2);
		System.out.println(t3);
		System.out.println(t4);
	}

}
