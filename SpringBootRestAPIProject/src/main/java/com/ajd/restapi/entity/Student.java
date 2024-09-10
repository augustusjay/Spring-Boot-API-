package com.ajd.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	@Column(name = "student_name")
	private String name;
	@Column(name="gpa")
	private double gpa;
	@Column(name="major")
	private String major;
	
	public Student() {

	}
	
	
	public Student(String name, double gpa, String major) {
		super();
		this.name = name;
		this.gpa = gpa;
		this.major = major;
	}


	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + studentId + ", name=" + name + ", gpa=" + gpa + ", major=" + major
				+ "]";
	}
	
	

}
