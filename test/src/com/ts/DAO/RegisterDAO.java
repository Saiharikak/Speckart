package com.ts.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;

import com.ts.rest.Student;
import com.ts.rest.User;

public class RegisterDAO extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public boolean addUser(User user) {
		String name = user.getName();
		String email = user.getEmail();
		String password = user.getPassword();
		String phoneno = user.getPhoneno();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/speckart", "root", "root");
			String query = "insert into User(name,email,password,phoneno) values (?,?,?,?)";
			ps = connection.prepareStatement(query);
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getPhoneno());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public RegisterDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static String validate(User user) {

		String email = user.getEmail();
		String password = user.getPassword();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/speckart", "root", "root");
			String query = "select * from User where email = '" + email + "' and password = '" + password + "'";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

			if (resultSet.next()) {
				return resultSet.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}