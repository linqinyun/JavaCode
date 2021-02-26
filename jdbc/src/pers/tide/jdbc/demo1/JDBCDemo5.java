package pers.tide.jdbc.demo1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

import pers.tide.jdbc.utils.JDBCUtils;

public class JDBCDemo5 {
	/**
	 * 查询数据
	 */
	@Test
	public void demo4() { 
		// 需要结果集对象 根据条数
		ResultSet rs = null;
	}

	/**
	 * 删除数据
	 */
	@Test
	public void demo3() {
		// 与修改数据一样，仅sql语句不同
	}

	/**
	 * 修改数据
	 */
	@Test
	public void demo2() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = JDBCUtils.getConnection();
			String sql = "update user set username = ? where uid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "wwww");
			pstmt.setInt(2, 3);
			int i = pstmt.executeUpdate();
			if(i > 0) {
				System.out.println("修改成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(pstmt, conn);
		}
	}

	@Test
	/**
	 * 保存数据
	 */
	public void demo1() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = JDBCUtils.getConnection();
			String sql = "insert into user values (null,?,?,?)";
			// 使用占位符进行sql 内容填充
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "ttt");
			pstmt.setString(2, "123");
			pstmt.setString(3, "张虎");
			int num = pstmt.executeUpdate();
			if (num > 0) {
				System.out.println("保存成功!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(pstmt, conn);
		}
	}
}
