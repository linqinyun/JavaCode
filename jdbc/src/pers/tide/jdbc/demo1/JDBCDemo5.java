package pers.tide.jdbc.demo1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

import pers.tide.jdbc.utils.JDBCUtils;

public class JDBCDemo5 {
	/**
	 * ��ѯ����
	 */
	@Test
	public void demo4() { 
		// ��Ҫ��������� ��������
		ResultSet rs = null;
	}

	/**
	 * ɾ������
	 */
	@Test
	public void demo3() {
		// ���޸�����һ������sql��䲻ͬ
	}

	/**
	 * �޸�����
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
				System.out.println("�޸ĳɹ�");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(pstmt, conn);
		}
	}

	@Test
	/**
	 * ��������
	 */
	public void demo1() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = JDBCUtils.getConnection();
			String sql = "insert into user values (null,?,?,?)";
			// ʹ��ռλ������sql �������
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "ttt");
			pstmt.setString(2, "123");
			pstmt.setString(3, "�Ż�");
			int num = pstmt.executeUpdate();
			if (num > 0) {
				System.out.println("����ɹ�!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(pstmt, conn);
		}
	}
}
