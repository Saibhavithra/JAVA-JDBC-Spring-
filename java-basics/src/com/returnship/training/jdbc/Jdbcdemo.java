package com.returnship.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcdemo {
	public static void main(String[] args){
		Connection con = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mars_sept";
		String userName ="root";
		String password ="Srisrianna111*";
		
		con = DriverManager.getConnection(url, userName, password);
	/*	if(con !=  null ) {
			System.out.println("Connection is Successful");}
			else
				{System.out.println("Connection refused");	
		}*/
		
		Statement stmt = con.createStatement();
		
		stmt.executeQuery("");
		//PreparedStatement pstmt = con.prepareStatement("select * from Product_JDBC_Sample");
	//	PreparedStatement pstmt = con.prepareStatement("select * from SALESMAN where SALESMAN_ID =? ");
	//2	pstmt.setString(1,"5001");
	//	pstmt.executeQuery();
		//ResultSet rs = stmt.executeQuery("select * from Product_JDBC_Sample");
	//	ResultSet rs = pstmt.executeQuery();
	//	while(rs.next()) {
     //    System.out.println(rs.getString(1)+":"+rs.getString(2));
	//	}
	
		PreparedStatement pstmt1 = con.prepareStatement("insert into SALESMAN values(?,?,?,?) ");
		pstmt1.setString(1,"5013");
		pstmt1.setString(2,"ram");
		pstmt1.setString(3,"sussex");
		pstmt1.setDouble(4,0.15000);
		int i =pstmt1.executeUpdate();
		System.out.println(i+ "records inserted");
		 String sql = "CREATE TABLE [Product_JDBC_Sample](" + "[ProductID] [int] IDENTITY(1,1) NOT NULL,"
	                + "[Name] [varchar](30) NOT NULL," + "[ProductNumber] [nvarchar](25) NOT NULL,)";
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}
	
	





// sudo mysql -u root -p 
//sudo mysql
