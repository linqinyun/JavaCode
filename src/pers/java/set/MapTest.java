package pers.java.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		// 字典实现功能
		Map<String,String> animal = new HashMap<String,String>();
		System.out.println("输入数据");
		Scanner console = new Scanner(System.in);
		int i = 0;
		while(i<3) {		
			System.out.println("请输入key值");
			String key = console.next();
			System.out.println("请输入value值");
			String value = console.next();
			animal.put(key, value);
			i++;
		}
		//打印
		System.out.println("================");
		System.out.println("输出");
		Iterator<String> it = animal.values().iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		//打印key与value的值
		System.out.println();
		System.out.println("=================");
		Set<Entry<String,String>> entrySet = animal.entrySet();
		
		for(Entry<String,String> entry:entrySet) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		
		//查找数据 keySet
		System.out.println();
		System.out.println("=================");
		System.out.println("查找");
		String strSearch = console.next();
		Set<String> keySet = animal.keySet();
		boolean flag = false;
		for(String key:keySet) {
			if(strSearch.equals(key)) {
				System.out.println("找到了"+key+"--"+animal.get(key));
				flag = true;
				break;
			}	
		}
		if(!flag) {
			System.out.println("未找到");
		}
	}
}
