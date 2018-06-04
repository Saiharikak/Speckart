package com.ts.DAO;

//import static util.Constants.SQLLOGIN;

import java.sql.*;

//import util.Connect;
import com.ts.rest.*;

import util.Connect;

public class LoginDAO {
    public  int checkUser(User user) {
    	
        Connection con = Connect.getConncetion();
        PreparedStatement pstmt;
        try {
            pstmt = con.prepareStatement("select * from User where  email = ? and password= ?");
            
            pstmt.setString(1, user.getEmail());
            pstmt.setString(2, user.getPassword());
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
            	int temp=rs.getInt(1);
                 user.setUid(temp);
                 if(temp != 0){
                	// System.out.println("Welcome " + temp);
                	return temp;
                 }
               
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 0;
    }

}