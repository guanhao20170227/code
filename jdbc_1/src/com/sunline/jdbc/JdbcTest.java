package com.sunline.jdbc;

import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 * 
 * @author GuanHao
 * @since  2017-6-28
 * @description JDbc 连接数据库
 */
public class JdbcTest 
{
	private  String driver ="com.mysql.jdbc.Driver";
	private  String url ="jdbc:mysql://localhost:3306/test";
	private  String username ="root";
	private  String password ="123";
	
	private  Connection conn;
	private PreparedStatement pres;
	
	
	public  Connection getConnection()
	{
		try 
		{
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);	
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public void release(ResultSet rs,PreparedStatement pstmt,Connection conn) 
	{
		if(rs != null)
		{
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(pstmt != null)
		{
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(conn != null)
		{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}
