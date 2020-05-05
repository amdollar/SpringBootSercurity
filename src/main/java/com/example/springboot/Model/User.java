package com.example.springboot.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class User {
	
	private String username;
	private String password;
	private String roletype;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoletype() {
		return roletype;
	}
	public void setRoletype(String roletype) {
		this.roletype = roletype;
	}
	
	
}
