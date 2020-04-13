package com.cg.go.bean;

public class UserDetails {
private String userId;
private String password;
private String email;
private String phNum;
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
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
	return "UserDetails [userId=" + userId + ", password=" + password + ", email=" + email + ", phNum=" + phNum + "]";
}

}
