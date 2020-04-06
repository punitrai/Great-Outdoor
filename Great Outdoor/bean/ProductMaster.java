package com.cg.go.bean;

public class ProductMaster {
private String username;
private String password;
private String email;
private String phNum;

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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhNum() {
	return phNum;
}
public void setPhNum(String phNum) {
	this.phNum = phNum;
}
@Override
public String toString() {
	return "ProductMaster [username=" + username + ", password=" + password + ", email=" + email + ", phNum=" + phNum
			+ "]";
}

}
