package com.csust.zx.entity;


public class User {
private String username;
private String password;
private String realname;
private String email;
private long phone;
public User() {
	
}
public User(String username,String password,String realname,String email,long phone) {
	this.username=username;
	this.password=password;
	this.realname=realname;
	this.email=email;
	this.phone=phone;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getRealname() {
	return realname;
}
public void setRealname(String realname) {
	this.realname = realname;
}
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
}
