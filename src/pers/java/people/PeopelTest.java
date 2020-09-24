package pers.java.people;


public class PeopelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person lili = new Person();
		lili.age = 12;
		
		// 第一种
		Person.Heart myHeart = new Person().new Heart();
		System.out.println(myHeart.beat());
		
		//第二种
		myHeart = lili.new Heart();
		System.out.println(myHeart.beat());
		
		//第三种
		myHeart = lili.getHeart();
		System.out.println(myHeart.beat());
	}

}
