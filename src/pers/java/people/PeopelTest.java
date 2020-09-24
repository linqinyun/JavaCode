package pers.java.people;


public class PeopelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person lili = new Person();
		lili.age = 12;
		
		// 第一种
		Person.Heart myHeart = new Person().new Heart();
		Person.Hand myHand = new Person.Hand();//静态调用
		System.out.println(myHeart.beat());
		Person.Hand.say();
		//第二种
		myHeart = lili.new Heart();
		System.out.println(myHeart.beat());
		
		//第三种
		myHeart = lili.getHeart();
		System.out.println(myHeart.beat());
		
		//方法内部类
		System.out.println(lili.getHand());
	}

}
