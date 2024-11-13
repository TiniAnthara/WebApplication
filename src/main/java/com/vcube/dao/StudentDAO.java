package com.vcube.dao;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.vcube.Connection1.MyConnection;
import com.vcube.model.Student;

public class StudentDAO {
	String status = null;
	public String create(Student s){
		String firstname = s.getFirstname();
		String lastname = s.getLastname();
		String username = s.getUsername();
		String email = s.getEmail();
		String phone = s.getPhone();
		String password = s.getPassword();
		String repwd = s.getRepwd();
  System.out.println(s+" code is working");
        //System.out.println("Data of DAO : " + firstname +"," + lastname +"," + username);
		try {
		Connection con = MyConnection.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into StudentTable values(?,?,?,?,?,?,?)");
		ps.setString(1, firstname);
		ps.setString(2, lastname);
		ps.setString(3, username); 
		ps.setString(4, email); 
		ps.setString(5, phone); 
		ps.setString(6, password); 
		ps.setString(7, repwd); 
		int n = ps.executeUpdate();
		if(n>0){
			status = "SUCCESS";
			System.out.println(n +" row(s) inserted");
		}
		}
		catch(Exception e){
			System.out.println("Exception : " + e);
			status = "FAILURE";
			System.out.println("something went wrong!!!");
		}
		return status;
	}
}
