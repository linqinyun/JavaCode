package pers.tide.reflect.demo;

import java.lang.reflect.Constructor;

import org.junit.Test;

public class GoodsTest {
	@Test
	public void demo1() throws Exception {
		Class class1 = Class.forName("pers.tide.reflect.demo.Goods");
		Constructor c = class1.getConstructor();
		Goods goods = (Goods)c.newInstance();
		goods.display();
	}
	@Test
	public void demo2() throws Exception {
		Class class1 = Class.forName("pers.tide.reflect.demo.Goods");
		Constructor c = class1.getConstructor(int.class,String.class,float.class,String.class);
		Goods goods = (Goods)c.newInstance(2,"test",1.12f,"this is test desc");
		System.out.println(goods);
	}
}
