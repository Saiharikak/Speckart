package util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connect {
	public static final String URL = "jdbc:mysql://localhost/speckart";
    public static final String USER = "root";
    public static final String PASSWORD = "root";
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    static {
        try {
            Class.forName(DRIVER);
        } catch (Exception er) {
            System.out.println("Driver error" + er);
        }
    }
    static Connection connection = null;

    public static void close(){
        if(connection!=null)
            try {
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    }
    public static Connection getConncetion() {
        try {
            if (connection == null || (connection != null && connection.isClosed())) {
                connection = DriverManager.getConnection(URL,USER,PASSWORD);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return connection;
    }
}

