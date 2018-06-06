package com.ts.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;

import com.ts.rest.Product;
import com.ts.rest.Student;
import com.ts.rest.User;

public class ProductDAO extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/*
	 * public boolean addProduct(Product product) { int pid = product.getPid();
	 * String pname = product.getPname(); String brand = product.getBrand();
	 * double price = product.getPrice();
	 * 
	 * Connection connection = null; Statement statement = null; ResultSet
	 * resultSet = null; PreparedStatement ps = null; try {
	 * Class.forName("com.mysql.jdbc.Driver"); connection =
	 * DriverManager.getConnection("jdbc:mysql://localhost/speckart",
	 * "root","root"); String query =
	 * "insert into Product(pid,pname,brand,quantity,price) values (?,?,?,?,?)";
	 * ps = connection.prepareStatement(query); ps.setInt(1, product.getPid());
	 * ps.setString(2, product.getPname()); ps.executeUpdate(); return true; }
	 * catch(Exception e) { e.printStackTrace(); } return false; } public
	 * ProductDAO() { super(); // TODO Auto-generated constructor stub }
	 */

	public List<Product> getAllProducts() {
		Product p;
		List<Product> products = new ArrayList();

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		PreparedStatement ps = null;
		String sql = "select * from Product where ptype = 'sunglasses'";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/speckart", "root", "root");
			ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				p = new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setBrand(rs.getString(3));
				p.setPrice(rs.getDouble(4));
				p.setPimage(rs.getString(5));

				System.out.println(p);
				products.add(p);
				System.out.println(p.getPid());
				// p.setCity(rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(products);
		return products;

	}

}