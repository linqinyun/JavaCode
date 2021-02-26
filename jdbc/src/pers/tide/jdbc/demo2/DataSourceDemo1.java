package pers.tide.jdbc.demo2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import pers.tide.jdbc.utils.JDBCUtils;
import pers.tide.jdbc.utils.JDBCUtils2;

/**
 * ���ӳز�����
 * 
 * @author ZHR
 *
 */
public class DataSourceDemo1 {
	@Test
	/**
	 * �����ļ����ӳ�
	 */
	public void demo2() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
//			ComboPooledDataSource dataSource = new ComboPooledDataSource();
			// �����������ݿ�

//			conn = dataSource.getConnection();
			conn = JDBCUtils2.getConnection();
			String sql = "select * from user";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("name") + "  " + rs.getString("username"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(rs, pstmt, conn);
		}
	}

	@Test
	/**
	 * �ֶ��������ӳ�
	 */
	public void demo1() {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			ComboPooledDataSource dataSource = new ComboPooledDataSource();
			// �����������ݿ�
			dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
			dataSource.setJdbcUrl(
					"jdbc:mysql://localhost/jdbc?serverTimezone=Hongkong&useUnicode=true&characterEncoding=utf-8");
			dataSource.setUser("root");
			dataSource.setPassword("");
			dataSource.setMaxPoolSize(20);
			dataSource.setInitialPoolSize(3);

			conn = dataSource.getConnection();
			String sql = "select * from user";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(rs, pstmt, conn);
		}
	}

}
