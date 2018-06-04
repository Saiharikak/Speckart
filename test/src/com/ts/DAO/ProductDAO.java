package com.ts.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;

import com.ts.rest.Product;
import com.ts.rest.Student;
import com.ts.rest.User;

public class ProductDAO extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	public boolean addProduct(Product product) {
		int pid = product.getPid();
		String pname = product.getPname();
		String brand = product.getBrand();
		int quantity = product.getQuantity();
		double price = product.getPrice();
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/speckart", "root","root");
			String query = "insert into Product(pid,pname,brand,quantity,price) values (?,?,?,?,?)";
			ps = connection.prepareStatement(query);
			ps.setInt(1, product.getPid());
			ps.setString(2, product.getPname());
			ps.executeUpdate();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
		}
    return false;
}
    public ProductDAO() {
        super();
        // TODO Auto-generated constructor stub
    }
}