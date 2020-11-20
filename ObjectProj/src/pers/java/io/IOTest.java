package pers.java.io;

import java.io.File;
import java.io.IOException;

public class IOTest {

	public static void main(String[] args) {
		// IO输入输出流
		//File file1 = new File("D:\\notes\\io\\score.txt");
		//File file1 = new File("D:\\notes","io\\score.txt");
		File file = new File("D:\\notes");
		File file1 = new File(file,"io\\score.txt");
		// 判断文件/目录
		System.out.println("是否目录："+file1.isDirectory());
		System.out.println("是否文件："+file1.isFile());
		//创建目录
		File file2 = new File("D:\\notes\\io\\set\\HashSet");
		if(!file2.exists()) {
			file2.mkdirs();
		}
		//创建文件
		if(!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
