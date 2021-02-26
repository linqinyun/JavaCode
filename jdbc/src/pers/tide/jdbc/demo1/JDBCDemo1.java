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
	 * jdbc入门
	 * 使用了
	 */
	public void demo1() {

		try {
			// 1.加载驱动
			//DriverManager.registerDriver(new Driver());驱动被加载两次
			Class.forName("com.mysql.jdbc.Driver"); //实际中使用驱动加载
			// 2.获得连接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?serverTimezone=Hongkong&useUnicode=true&characterEncoding=utf-8","root","");
			// 3.创建执行sql语句，并执行sql
			String sql = "select * from user";
				// 3.1创建执行sql对象
			Statement stmt = conn.createStatement();
				// 3.2执行sql的对象
			ResultSet resultSet = stmt.executeQuery(sql);
			while(resultSet.next()) {
				int uid = resultSet.getInt("uid");
				String username = resultSet.getString("username");
				String password = resultSet.getString("password");
				String name = resultSet.getString("name");
				System.out.println(uid+"   "+username+"   "+password+"    "+name);
			}
			// 4.释放资源
			resultSet.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
