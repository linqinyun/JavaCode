package pers.tide.jdbc.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

public class JDBCDemo3 {
	@Test
	/**
	 * 	ɾ������
	 */
	public void demo3() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?serverTimezone=Hongkong&useUnicode=true&characterEncoding=utf-8","root","");
			stmt = conn.createStatement();
			String sql = "delete from user where uid = 5";
			int i = stmt.executeUpdate(sql);
			if(i>0) {
				System.out.println("ɾ���ɹ�");
				rs = stmt.executeQuery("select * from user");
				while(rs.next()) {
					int uid = rs.getInt("uid");
					String username = rs.getString("username");
					String password = rs.getString("password");
					String name = rs.getString("name");
					System.out.println(uid+"   "+username+"   "+password+"   "+name);
				}
			}else {
				System.out.println("ɾ��ʧ��");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
			if(stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				stmt = null;
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				conn = null;
			}
			
		}
	}
	//@Test
	/**
	 *	�޸Ĳ���
	 */
	public void demo2() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?serverTimezone=Hongkong&useUnicode=true&characterEncoding=utf-8","root","");
			stmt = conn.createStatement();
			String sql = "update user set username = 'kkk',name='��˼'  where uid = 6 ";
			int i = stmt.executeUpdate(sql);
			if(i>0) {
				System.out.println("�޸ĳɹ�");
				rs = stmt.executeQuery("select * from user");
				while(rs.next()) {
					int uid = rs.getInt("uid");
					String username = rs.getString("username");
					String password = rs.getString("password");
					String name = rs.getString("name");
					System.out.println(uid+"   "+username+"   "+password+"   "+name);
				}
			}else {
				System.out.println("�޸�ʧ��");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
			if(stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				stmt = null;
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				conn = null;
			}
			
		}
	}
	//@Test
	/**
	 * 	�������
	 */
	public void demo1() {
		Connection conn = null;
		Statement stmt = null;
		try {
			// ע������
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?serverTimezone=Hongkong&useUnicode=true&characterEncoding=utf-8","root","");
			stmt = conn.createStatement();
			String sql = "insert into user values (null,'eee','123','����')";
			int i = stmt.executeUpdate(sql);
			if(i>0) {
				System.out.println("���ݱ���ɹ�");
			}else{
				System.out.println("���ݱ���ʧ��");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				stmt = null;
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				conn = null;
			}
			
		}
	}
}
