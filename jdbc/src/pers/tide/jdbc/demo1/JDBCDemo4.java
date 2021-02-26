package pers.tide.jdbc.demo1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

import pers.tide.jdbc.utils.JDBCUtils;

public class JDBCDemo4 {
	@Test
	public void demo1() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from user");
			while(rs.next()) {
				System.out.println(rs.getInt("uid")+"  "+ 
				rs.getString("username") + "    " +
				rs.getString("name")
			);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtils.release(rs, stmt, conn);
		}
	}
}
