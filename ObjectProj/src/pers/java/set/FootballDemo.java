package pers.java.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FootballDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> country = new HashMap<String,String>();
		country.put("2014", "德国");
		country.put("2010", "西班牙");
		country.put("2006", "意大利");
		country.put("2002", "巴西");
		country.put("1998", "法国");
		
		Iterator<String> it = country.values().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("====================");
		
		Set<Entry<String,String>> entrySet = country.entrySet();
		for(Entry<String,String> entry:entrySet) {
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
	}

}
