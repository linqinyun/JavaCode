package pers.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo1 {
	public static void main(String[] args) {
		try {
			FileInputStream fls = new FileInputStream("javaSt.txt");
//			int n = fls.read();
			int n = 0;
//			while(n!=-1) {
//				System.out.print((char)n);
//				n = fls.read();
//			}
			while((n=fls.read())!=-1) {
				System.out.print((char)n);
			}
			fls.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
