package pers.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fls = new FileInputStream("javaSt.txt");
			byte[] b = new byte[100];
			fls.read(b);
			System.out.println(new String(b));
			fls.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
