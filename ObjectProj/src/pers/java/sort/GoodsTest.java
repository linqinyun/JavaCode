package pers.java.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods g1 = new Goods("s00001","手机",2000);
		Goods g2 = new Goods("s00002","冰箱",5000);
		Goods g3 = new Goods("s00003","热水器",6000);
		List<Goods> goodsList = new ArrayList<Goods>();
		goodsList.add(g1);
		goodsList.add(g2);
		goodsList.add(g3);
		
		for(Goods goods:goodsList) {
			System.out.println(goods+" ");
		}
		System.out.println();
		Collections.sort(goodsList);
		for(Goods goods:goodsList) {
			System.out.println(goods+" ");
		}
	}

}
