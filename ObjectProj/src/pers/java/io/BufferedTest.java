package pers.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedTest {

	public static void main(String[] args) {
		// 测试使用
		// 文件路径
		String oneTxt = "D:\\notes\\io\\one.txt";
		String towTxt = "D:\\notes\\io\\tow.txt";
		File f1 = new File(oneTxt);
		File f2 = new File(towTxt);
		// 创建文件
		if (!f1.exists()) {
			try {
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (!f2.exists()) {
			try {
				f2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// f1使用 非缓冲 记录时间
		try {
			// 缓冲区使用
			FileOutputStream fosf1 = new FileOutputStream(f1, true);
			long startTime = System.currentTimeMillis();
			int n = 0;
			while (n < 10000) {
				fosf1.write('a');
				n++;
			}
			fosf1.close();
			long endTime = System.currentTimeMillis();
			System.out.println(endTime - startTime);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// f2使用 缓冲使用 记录时间
		try {
			// 缓冲区使用
			FileOutputStream fosf2 = new FileOutputStream(f2);
			BufferedOutputStream bosf2 = new BufferedOutputStream(fosf2);
			long startTime1 = System.currentTimeMillis();
			int n = 0;
			while (n < 10000) {
				bosf2.write('a');
				n++;
			}
			bosf2.flush();
			fosf2.close();
			bosf2.close();
			long endTime1 = System.currentTimeMillis();
			System.out.println(endTime1 - startTime1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// end
	}

}
