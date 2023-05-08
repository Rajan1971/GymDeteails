package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class GymModel 
{
	@Id                                         
   private int custnum;
   private String custname;
   private String gymfees;
public int getCustnum() {
	return custnum;
}
public void setCustnum(int custnum) {
	this.custnum = custnum;
}
public String getCustname() {
	return custname;
}
public void setCustname(String custname) {
	this.custname = custname;
}
public String getGymfees() {
	return gymfees;
}
public void setGymfees(String gymfees) {
	this.gymfees = gymfees;
}
}