package com.vcube.controller;
import java.io.IOException;

import com.vcube.dao.StudentDAO;
import com.vcube.model.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		String repwd = request.getParameter("repwd");

		System.out.println("Data of Controller : " +firstname +"," +lastname +"," +username);
		Student s = new Student();
		s.setFirstname(firstname);
		s.setLastname(lastname);
		s.setUsername(username);
		s.setEmail(email);
		s.setPhone(phone);
		s.setPassword(password);
		s.setRepwd(repwd);

		StudentDAO sd = new StudentDAO();
		
		String status = sd.create(s);
		if(status.equals("SUCCESS")){
			 request.setAttribute("firstname", firstname);
			 RequestDispatcher rd=request.getRequestDispatcher("/login.html");  
	         rd.include(request, response); 
	       }
		else{
			RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
	        rd.include(request, response);  
		}
		System.out.println(username);
		
	}
}
