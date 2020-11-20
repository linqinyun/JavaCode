package pers.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamDemo1 {
	public static void main(String[] args) {
		//输出流-FileOutputStream，数据写入
		FileOutputStream fos;
		FileInputStream fis;
		try {
			//为true表示追加，默认false
			fos = new FileOutputStream("javaSt.txt",true);
			fis =new FileInputStream("javaSt.txt");
			fos.write(50);
			fos.write('a');
			System.out.println(fis.read());
			System.out.println((char)fis.read());
			fos.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}
}
