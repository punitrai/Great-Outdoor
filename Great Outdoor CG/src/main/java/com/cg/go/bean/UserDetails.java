package com.cg.go.bean;

public class UserDetails {
private String userId;
private String password;
private String email;
private long phNum;
public String getUserId() {
	return userId;
}
public String setUserId(String userId) {
	return this.userId = userId;
}
public String getPassword() {
	return password;
}
public String setPassword(String password) {
	return this.password = password;
}
public String getEmail() {
	return email;
}
public String setEmail(String email) {
	return this.email = email;
}
public long getPhNum() {
	return phNum;
}
public long setPhNum(long phNum) {
	return this.phNum = phNum;
}
@Override
public String toString() {
	return "UserDetails [userId=" + userId + ", password=" + password + ", email=" + email + ", phNum=" + phNum + "]";
}

}
