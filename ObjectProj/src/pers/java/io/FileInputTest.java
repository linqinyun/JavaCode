package pers.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fl = new File("javaSt.txt");
		try {
			FileInputStream fls = new FileInputStream(fl);
			int count = 0;
			int n = 0;
			System.out.print("文本内容:");
			while((n=fls.read())!=-1) {
				System.out.print((char)n);
				count++;
			}
			System.out.println();
			System.out.println("统计结果："+fl.getName()+" 字符: "+count);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
