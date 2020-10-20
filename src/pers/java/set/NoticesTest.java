package pers.java.set;

import java.util.ArrayList;
import java.util.Date;

public class NoticesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//公告发布/修改/删除
		Notices notices1 = new Notices(1,"欢迎来到1","管理员1",new Date());
		Notices notices2 = new Notices(2,"欢迎来到2","管理员2",new Date());
		Notices notices3 = new Notices(3,"欢迎来到3","管理员3",new Date());
		
		ArrayList noticesList = new ArrayList();
		noticesList.add(notices1);
		noticesList.add(notices2);
		noticesList.add(notices3);
		
		
		System.out.println("公告内容：");
		for(int i=0;i<noticesList.size();i++) {
			System.out.println((i+1)+":"+((Notices)(noticesList.get(i))).getTitle());
		}
		
		Notices notices4 = new Notices(4,"欢迎来到4","管理员4",new Date());
		noticesList.add(1,notices4);
		System.out.println("公告内容：");
		for(int i=0;i<noticesList.size();i++) {
			System.out.println((i+1)+":"+((Notices)(noticesList.get(i))).getTitle());
		}
		
		noticesList.remove(notices2);
		
		System.out.println("公告内容：");
		for(int i=0;i<noticesList.size();i++) {
			System.out.println((i+1)+":"+((Notices)(noticesList.get(i))).getTitle());
		}
		
		notices4.setTitle("test");
		noticesList.set(1, notices4);
		
		System.out.println("公告内容：");
		for(int i=0;i<noticesList.size();i++) {
			System.out.println((i+1)+":"+((Notices)(noticesList.get(i))).getTitle());
		}
		
	}	

}
