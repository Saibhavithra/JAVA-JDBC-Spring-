package com.returnship.training.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class jdbcdemo3 {

	 

	 

	 
		public static void main(String[] args) throws SQLException {
			Connection con = null;
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//Control+shift+t
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mars_sept", "root","Srisrianna111*");//url+db name(mars_sep),username/pasword
			if (con!=null) {
				System.out.println("Connection is sucessfull");
			} else {
				System.out.println("Connection is NOT sucessfull");
			}
			 PreparedStatement crst = con.prepareStatement("SELECT * FROM PERSON");	//	
			ResultSet rs = crst.executeQuery();
		      
		  	List<Person> personList = new ArrayList<>();
	 
			while (rs.next()) {
				   Person person = new Person();
			     
			         person.setName(rs.getString(1));
			         person.setAge(rs.getInt(2));
			         personList.add(person);
			         
				//System.out.println(rs.getInt(1)+":=====>"+rs.getString(2)+":=====>"+rs.getString(4)+":======>"+rs.getInt(5));			
			}
			personList.stream().filter(e -> e.getAge()>26).forEach(System. out::println);  
		}
		
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				
					con.close();
				
				}
			
			}
		}
