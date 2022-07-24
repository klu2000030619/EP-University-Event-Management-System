package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.model.User;

public class UserManager {
	   String url="jdbc:mysql://localhost:3306/kludb1"; 
	   String username="root"; 
	   String password="Harshitha@123"; 
	   Connection con=null; 
	   PreparedStatement ps=null; 
	   //PreparedStatement ps1=null;
	   //PreparedStatement ps2=null;
	   //PreparedStatement ps3=null;
	   public String saveData(User U) throws Exception {
		    con = DriverManager.getConnection(url, username, password);
		    ps = con.prepareStatement("insert into user values(?,?,?,?,?,?,?)"); 
		    ps.setString(1, U.getFirstname());
		    ps.setString(2, U.getLastname());
		    ps.setString(3, U.getEmail());
		    ps.setString(4, U.getDob());
		    ps.setString(5, U.getPhonenumber());
		    ps.setString(6,U.getUsername());
		    ps.setString(7, U.getPassword());
		    ps.execute();
		    con.close();
		    return "Registered successfully";
		  }
}
