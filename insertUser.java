package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.User;
import com.model.UserManager;

@WebServlet("/insertUser")
public class insertUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html"); 
		  PrintWriter pw=response.getWriter(); 
		  try 
		  { 
		   User u=new User(); 
		   UserManager um=new UserManager();  
		   String firstname=request.getParameter("firstname");
		   String lastname=request.getParameter("lastname"); 
		   String email=request.getParameter("email"); 
		   String username=request.getParameter("username"); 
		   String password=request.getParameter("password"); 
		   String dob=request.getParameter("dob"); 
		   String phonenumber=request.getParameter("phonenumber"); 
		   u.setFirstname(firstname); 
		   u.setLastname(lastname);
		   u.setEmail(email);
		   u.setDob(dob);
		   u.setPhonenumber(phonenumber);
		   u.setUsername(username);
		   u.setPassword(password);
		   String ack=um.saveData(u); 
		   pw.print(ack); 
		  } 
		  catch(Exception e) 
		  { 
		   pw.print(e.getMessage()); 
		    
		  } 
		  RequestDispatcher rd=request.getRequestDispatcher("addnew.jsp"); 
		  rd.include(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
