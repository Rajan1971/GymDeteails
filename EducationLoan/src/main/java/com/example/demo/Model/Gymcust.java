package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Gymcust {
	@Id
	private int custnum;
	private int age;
	private String custname;
	private String username;
	private String password;
	private String email;
	private String phnno;
	private String custadd;
	private String custcity;
	private String custproof;
	public int getCustnum() {
		return custnum;
	}
	public void setCustnum(int custnum) {
		this.custnum = custnum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhnno() {
		return phnno;
	}
	public void setPhnno(String phnno) {
		this.phnno = phnno;
	}
	public String getCustadd() {
		return custadd;
	}
	public void setCustadd(String custadd) {
		this.custadd = custadd;
	}
	public String getCustcity() {
		return custcity;
	}
	public void setCustcity(String custcity) {
		this.custcity = custcity;
	}
	public String getCustproof() {
		return custproof;
	}
	public void setCustproof(String custproof) {
		this.custproof = custproof;
	}
	

}
