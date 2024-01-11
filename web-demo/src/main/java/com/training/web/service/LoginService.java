package com.training.web.service;

import com.training.web.dao.UserDAO;
import com.training.web.model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;


 
public class LoginService {
 
	public User checkLogin(String name, String password) throws Exception {
		UserDAO userDAO = new UserDAO();
		Connection connection = userDAO.connect();

		PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE name = ? and password = ?");
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