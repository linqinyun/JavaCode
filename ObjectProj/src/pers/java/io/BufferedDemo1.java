package pers.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDemo1 {

	public static void main(String[] args) {
		 try {
			FileOutputStream fos = new FileOutputStream("javaSt.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			FileInputStream fis = new FileInputStream("javaSt.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			long startTime = System.currentTimeMillis();
			bos.write(50);
			bos.write('a');
			bos.flush();
			System.out.println(bis.read());
			System.out.println((char)bis.read());
			long endTime = System.currentTimeMillis();
			System.out.println(endTime-startTime);
			bos.close();
			fos.close();
			fis.close();
			bis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
