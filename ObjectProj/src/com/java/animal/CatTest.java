package com.java.animal;

import com.java.login.User;
import com.java.login.UserOperation;
import com.java.test.*;

public class CatTest {
	//单一责任原则
	public static void main(String[] args) {
//		Cat one = new Cat();
//		one.run();
//		one.name = "test";
//		Person ps = new Person("小明",10,"五");
//		ps.student();
//		ps.sex("男");
//		ps.mySelf();
//		System.out.println("====================");
//		Monkey mk = new Monkey();
//		mk.setName("长尾猴");
//		mk.setFeature("尾巴长");
//		System.out.println("名称："+mk.getName());
//		System.out.println("特征："+mk.getFeature());
//		System.out.println("====================");
//		Monkey mks = new Monkey("白头叶猴","头上有白毛，喜欢吃树叶");
////		System.out.println("名称："+mks.name);
//		System.out.println("特征："+mks.getFeature());
//		Book bk = new Book("红楼梦","曹雪芹","人民文学出版社",9f);
//		System.out.println("书名："+bk.getName());
//		System.out.println("作者："+bk.getAuthor());
//		System.out.println("出版社："+bk.press);
//		System.out.println("价格："+bk.price+"元");
//		System.out.println("====================================");
//		Book bkk = new Book("红楼梦","曹雪芹","人民文学出版社",11f);
//		System.out.println("书名："+bkk.getName());
//		System.out.println("作者："+bkk.getAuthor());
//		System.out.println("出版社："+bkk.press);
//		System.out.println("价格："+bkk.price+"元");
		User ue1 = new User("lucy","123456");
		User ue2 = new User("lucys","123456");
		UserOperation uo = new UserOperation();
		String urResult = uo.checkUser(ue1, ue2);
		System.out.println(urResult);
	}
}
