package com.cglia.tms.Model;

public class Trainee {
 private Integer id;
 private String name;
 private String email;
 private String mob_no;
 private String college_name;
 private String city;
 public Trainee(Integer id, String name, String email, String mob_no, String college_name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mob_no = mob_no;
		this.college_name = college_name;
		this.city = city;
	}
 
 public Trainee() {
	super();
}

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
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
public String getMob_no() {
	return mob_no;
}
public void setMob_no(String mob_no) {
	this.mob_no = mob_no;
}
public String getCollege_name() {
	return college_name;
}
public void setCollege_name(String college_name) {
	this.college_name = college_name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Trainee [id=" + id + ", name=" + name + ", email=" + email + ", mob_no=" + mob_no + ", college_name="
			+ college_name + ", city=" + city + "]";
}
}