package com.sunline.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test 
{
	public static void main(String[] args) {
		JdbcTest jtest = new JdbcTest();
		Connection conn = jtest.getConnection();
		PreparedStatement  pres = null;
		ResultSet  res = null;
		String sql = "SELECT * FROM gh_temp";
		try 
		{
			pres = conn.prepareStatement(sql);
			res = pres.executeQuery();
			while(res.next())
			{
				int id = res.getInt("id");
				String name = res.getString("name");
				System.out.println("id" + id +",name" + name);
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		jtest.release(res, pres, conn);
	}

}
