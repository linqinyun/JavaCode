package pers.java.warps;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //定义float类型变量，赋值为88.99
		float f1 = 88.99f;
		//将基本类型转换为字符串
		String str1 = Float.toString(f1);                            
		//打印输出
		System.out.println(str1);
		//定义String类型变量，赋值为"188.55"
		String str = "188.55";
	    // 将字符串转换为基本类型double
		Double s = Double.valueOf(str);
		//打印输出
		System.out.println(s);
	}

}
