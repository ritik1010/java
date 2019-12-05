package com.javapr.javaPr;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.rest.core.annotation.RestResource;
@Entity
@RestResource
@Table(name="vehicle")
public class Vehicle {
	
	@Column(name="name")
	String name;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="uno")
	
	int uno;
	
	 @Column(name="number")
	String number;
	
	 @Column(name="color")
String color;
	 @Column(name="reg")
String reg;
	 @Column(name="belong")
String belong;
	 @Column(name="oname")
String oname;
	 @Column(name="year")
String year;
	 @Column(name="addr")
String addr;
	 
	 
	 @Column(name="model")
	String model;
	 
	 public Vehicle() {
		 super();
	 }
	 public Vehicle(String number,String name,String color, String reg,String vehivleBelogTo,String oname,String year,String addr,String adhno) {
		 super();
		 this.number=number;
		 this.name=name;
		 this.color=color;
		 this.reg=reg;
		 this.belong=belong;
		 this.color=color;
		
		 this.addr=addr;
		 
		 
	 }

public String getname() {
	return name;
}
public void setname(String name) {
	this.name = name;
}
public String getnumber() {
	return number;
}
public void setnumber(String number) {
	this.number = number;
}
public String getcolor() {
	return color;
}
public void setcolor(String color) {
	this.color = color;
}
public String getreg() {
	return reg;
}
public void setreg(String reg) {
	this.reg = reg;
}
public String getbelong() {
	return belong;
}
public void setbelong(String belong) {
	this.belong = belong;
}
public String getoname() {
	return oname;
}
public void setoname(String oname) {
	this.oname = oname;
}
public String getyear() {
	return year;
}
public void setyear(String year) {
	this.year = year;
}
public String getaddr() {
	return addr;
}
public void setaddr(String addr) {
	this.addr = addr;
}

public void setmodel(String model) {
	this.model=model;
	
}
public String getmodel() {
	return this.model;
	
}
public int getuno() {
	return this.uno;
}
public void setuno(int uno) {
	this.uno=uno;
	
}
}
