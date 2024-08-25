package com.tnsif.pm.student;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate dateOfBirth;
	private String department;
	
	//getters and setters
	//getId is my primarykey
	
	
	 public Student() {
		 
	 }
	public Student(Long id, String firstName, String lastName, String email, LocalDate dateOfBirth, String department) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.department = department;
	}
	
	@Id
	//@GeneratedValue  (strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String long1) {
		this.department = long1;
	}
	
	//Getter and Setter
	
	
	
	
	
}
