package pers.java.io;

import java.io.File;
import java.io.IOException;

public class Monday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\notes\\io\\Monday.docx");
		//是否存在文件
		if(!file.exists()) {
			try {
				//创建文件
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("文件创建成功");
		}else {
			//返回文件名称
			//返回父目录
			System.out.println("文件已存在");
		}
		//是否文件
		if(file.isFile()) {//文件
			//返回文件名称
			//返回父目录
			System.out.println("文件名称："+file.getName());
			System.out.println("文件的上一级目录："+file.getParentFile().getName());
			System.out.println("这是文件");
		}else if(file.isDirectory()) {//目录
			System.out.println("这是目录");
		}else {
			//不是目录和文件
			System.out.println("既不是文件也不是目录");
		}

		if(file.canWrite()&&file.canRead()) {
			System.out.println("读写性:这个文件可读可写");	
		}else if(file.canWrite()||file.canRead()){
			if(file.canWrite()) {
				System.out.println("读写性:这个文件可写");	
			}else {
				System.out.println("读写性:这个文件不可写");
			}
			if(file.canRead()) {
				System.out.println("读写性:这个文件可读");	
			}else {
				System.out.println("读写性:这个文件不可读");
			}
		}else {
			System.out.println("读写性:这个文件不可读/写");
		}
	}

}
