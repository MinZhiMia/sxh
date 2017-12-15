package cn.lxit.books.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class BaseDao {
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public ResultSet rs = null;

	/*private final String driverUrl = "com.mysql.jdbc.Driver";
	private final String url = "jdbc:mysql://localhost:3306/NewsManagerSystem";
	private final String userName = "root";
	private final String pwd = "root";*/

	// ��ȡ���Ӷ���
	public Connection getConnection() {
		/*try {
			Class.forName(driverUrl);
			conn = DriverManager.getConnection(url, userName, pwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
		
		ComboPooledDataSource cd = new ComboPooledDataSource();
		try {
			conn =  cd.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	// �ر����Ӷ���
	public void closeAll(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();  
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// ʵ�ֶ����ݿ������ɾ���Ĳ���,������Ӱ�������
	public int executeUpdate(String sql, Object[] parms) {
		try {
			// ��ȡ����
			conn = getConnection();
			// ��ȡִ�ж���
			pstmt = conn.prepareStatement(sql);
			// ��ִ�ж����е�sql��丳����
			if (parms != null) {
				for (int i = 0; i < parms.length; i++) {
					pstmt.setObject(1 + i, parms[i]);
				}
			}
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeAll(conn, pstmt, rs);
		}
		return -1;
	}

	// ʵ�ֲ�ѯ�ķ��� ע�⣺ һ�������ڴ˷���������Ϲر�,���ؽ����
	public ResultSet executeQuery(String sql, Object[] parms) {
		try {
			// ��ȡ����
			conn = getConnection();
			// ��ȡִ�ж���
			pstmt = conn.prepareStatement(sql);
			// ��ִ�ж����е�sql��丳����
			if (parms != null) {
				for (int i = 0; i < parms.length; i++) {
					pstmt.setObject(1 + i, parms[i]);
				}
			}
			return pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
