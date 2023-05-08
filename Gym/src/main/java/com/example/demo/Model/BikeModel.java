package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class BikeModel 
{
	@Id                                         
   private int bikenum;
   private String bikename;
   private String bikeversion;
   private String bikecolor;
   private String bikemileage;
   private String bikeprice;
public int getBikenum() {
	return bikenum;
}
public void setBikenum(int bikenum) {
	this.bikenum = bikenum;
}
public String getBikename() {
	return bikename;
}
public void setBikename(String bikename) {
	this.bikename = bikename; 
}
public String getBikeversion() {
	return bikeversion;
}
public void setBikeversion(String bikeversion) {
	this.bikeversion = bikeversion;
}
public String getBikecolor() {
	return bikecolor;
}
public void setBikecolor(String bikecolor) {
	this.bikecolor = bikecolor;
}
public String getBikemileage() {
	return bikemileage;
}
public void setBikemileage(String bikemileage) {
	this.bikemileage = bikemileage;
}
public String getBikeprice() {
	return bikeprice;
}
public void setBikeprice(String bikeprice) {
	this.bikeprice = bikeprice;
}
   
}
