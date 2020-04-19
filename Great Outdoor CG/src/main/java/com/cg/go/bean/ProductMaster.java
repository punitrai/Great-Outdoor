package com.cg.go.bean;

public class ProductMaster {
private String username;
private String password;
private String email;
private long phNum;

public String getUsername() {
	return username;
}
public String setUsername(String username) {
	return this.username = username;
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
public long setPhNum(long e) {
	return this.phNum = e;
}
@Override
public String toString() {
	return "ProductMaster [username=" + username + ", password=" + password + ", email=" + email + ", phNum=" + phNum
			+ "]";
}


}
