package com.model;

import org.springframework.context.annotation.Configuration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "student")
@Configuration
public class Student_Model {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	int id ;
	public String StudentName;
	public String StudentEmail;
	public String StudentAddress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentEmail() {
		return StudentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		StudentEmail = studentEmail;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	
	public String toString() {
		return "Tutorial [id=" + id + ", StudentName=" + StudentName + ", StudentEmail=" + StudentEmail
				+ ", StudentAddress=" + StudentAddress + "]";
	}
}
