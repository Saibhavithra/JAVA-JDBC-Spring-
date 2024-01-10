package com.training.web.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import java.sql.*;

import com.training.web.model.User;
public class UserDAO {
	
	public User checkLogin(String name, String password) throws SQLException,
    ClassNotFoundException {
String jdbcURL = "jdbc:mysql://localhost:3306/mars_sept";
String dbUser = "root";
String dbPassword = "Srisrianna111*";

Class.forName("com.mysql.jdbc.Driver");
Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

//Class.forName("com.mysql.cj.jdbc.Driver");//Control+shift+t
//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mars_sept", "root","Srisrianna111*");

String sql = "SELECT * FROM users WHERE name = ? and password = ?";
PreparedStatement statement = connection.prepareStatement(sql);
statement.setString(1, name);
statement.setString(2, password);

ResultSet result = statement.executeQuery();

User user = null;

if (result.next()) {
    user = new User();
    user.setName(result.getString("name"));
    user.setPassword( password);
}

connection.close();

return user;
}
}


