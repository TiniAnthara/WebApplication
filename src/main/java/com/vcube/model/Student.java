package com.vcube.model;

public class Student {
	private String firstname;
			public String getFirstname() {
				return firstname;
			}		
			public void setFirstname(String firstname) {
				this.firstname = firstname;
			}
			
	private String lastname;		
			public String getLastname() {
				return lastname;
			}
			public void setLastname(String lastname) {
				this.lastname = lastname;
			}
			
	private String username;
			public String getUsername() {
				return username;
			}		
			public void setUsername(String username) {
				this.username = username;
			}
			
	private String email;
			public String getEmail() {
				return email;
			}		
			public void setEmail(String email) {
				this.email = email;
			}
			
	private String phone;		
			public String getPhone() {
				return phone;
			}			
			public void setPhone(String phone) {
				this.phone = phone;
			}
			
	private String password;	
			public String getPassword() {
				return password;
			}	
			public void setPassword(String password) {
				this.password = password;
			}
			
   private String repwd;
			public String getRepwd() {
				return repwd;
			}	
			public void setRepwd(String repwd) {
				this.repwd = repwd;
			}
			
@Override
			public String toString() {
				return "Student [firstname=" + firstname + ", lastname=" + lastname + ", username=" + username
						+ ", email=" + email + ", phone=" + phone + ", password=" + password + ", repwd=" + repwd + "]";
			}
			
}
