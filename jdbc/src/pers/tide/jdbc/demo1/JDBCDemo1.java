package pers.tide.jdbc.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.mysql.cj.jdbc.Driver;

public class JDBCDemo1 {
	
	@Test
	/**
	 * jdbc����
	 * ʹ����
	 */
	public void demo1() {

		try {
			// 1.��������
			//DriverManager.registerDriver(new Driver());��������������
			Class.forName("com.mysql.jdbc.Driver"); //ʵ����ʹ����������
			// 2.�������
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?serverTimezone=Hongkong&useUnicode=true&characterEncoding=utf-8","root","");
			// 3.����ִ��sql��䣬��ִ��sql
			String sql = "select * from user";
				// 3.1����ִ��sql����
			Statement stmt = conn.createStatement();
				// 3.2ִ��sql�Ķ���
			ResultSet resultSet = stmt.executeQuery(sql);
			while(resultSet.next()) {
				int uid = resultSet.getInt("uid");
				String username = resultSet.getString("username");
				String password = resultSet.getString("password");
				String name = resultSet.getString("name");
				System.out.println(uid+"   "+username+"   "+password+"    "+name);
			}
			// 4.�ͷ���Դ
			resultSet.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
