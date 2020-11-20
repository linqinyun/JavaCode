package pers.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "D:\\notes\\io\\test.txt";
		String filePath1 = "D:\\notes\\io\\test1.txt";
		try {
			FileInputStream fis = new FileInputStream(filePath);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			FileOutputStream fos = new FileOutputStream(filePath1);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			int n = 0;
			char[] cbuf = new char[10];
//			while((n=isr.read())!=-1) {
//				System.out.print((char)n);
//			}
//			while((n=isr.read(cbuf))!=-1) {
//				String s = new String(cbuf,0,n);
//				System.out.print(s);
//			}
			while((n=br.read(cbuf))!=-1) {
//				String s = new String(cbuf,0,n);
//				osw.write(s);
				bw.write(cbuf,0,n);
				bw.flush();
			}
			fis.close();
			fos.close();
			isr.close();
			osw.close();
			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
