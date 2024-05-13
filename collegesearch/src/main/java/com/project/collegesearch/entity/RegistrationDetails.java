package com.project.collegesearch.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "registration_details")
public class RegistrationDetails {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String First_Name ,Last_Name;
   private String email;
   private String Education;
   private String Stream;
   private String YOP;
   private int marks;
   private String gender;
   private String password;
   private String cpassword;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFirst_Name() {
	return First_Name;
}
public void setFirst_Name(String first_Name) {
	First_Name = first_Name;
}
public String getLast_Name() {
	return Last_Name;
}
public void setLast_Name(String last_Name) {
	Last_Name = last_Name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getEducation() {
	return Education;
}
public void setEducation(String education) {
	Education = education;
}
public String getStream() {
	return Stream;
}
public void setStream(String stream) {
	Stream = stream;
}
public String getYOP() {
	return YOP;
}
public void setYOP(String yOP) {
	YOP = yOP;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCpassword() {
	return cpassword;
}
public void setCpassword(String cpassword) {
	this.cpassword = cpassword;
}

   // Getters and Setters
public void updateFields(RegistrationDetails updatedDetails) {
    this.First_Name = updatedDetails.getFirst_Name();
    this.Last_Name= updatedDetails.getLast_Name();
    this.Education=updatedDetails.getEducation();
    this.gender=updatedDetails.getGender();
    this.YOP=updatedDetails.getYOP();
    this.Stream=updatedDetails.getStream();
    this.email = updatedDetails.getEmail();
    this.password = updatedDetails.getPassword();  
    this.cpassword=updatedDetails.getCpassword();
}
}
