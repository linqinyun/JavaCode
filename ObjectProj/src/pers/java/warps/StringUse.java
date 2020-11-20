package pers.java.warps;

public class StringUse {
	public static void main(String[] args) {
		double a = 12.5;
		String str1 = Double.toString(a);
		System.out.println(str1);
		String str = "2.8";
		// 将字符串转换为基本类型
		double b = Double.valueOf(str);
        System.out.println(b);
        
        Integer one = 100;
        Integer two = 100;
        System.out.println(one==two);
        
	}

}
