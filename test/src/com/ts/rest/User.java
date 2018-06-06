package com.ts.rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
private String name;
private String email;
private String password;
private String phoneno;
private int uid;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public User(String name, String email, String password, String phoneno, int uid) {
	super();
	this.name = name;
	this.email = email;
	this.password = password;
	this.phoneno = phoneno;
	this.uid = uid;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "User [name=" + name + ", email=" + email + ", password=" + password + ", phoneno=" + phoneno + ", uid="
			+ uid + "]";
}


}