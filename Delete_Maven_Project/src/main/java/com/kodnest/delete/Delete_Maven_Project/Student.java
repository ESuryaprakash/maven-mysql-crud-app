package com.kodnest.delete.Delete_Maven_Project;

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
	int id;
	@Column
	String name;
	@Column
	String eMail;
	@Column
	int phoneNum;
	
	
	Student(){
	}

	public Student(int id, String name, String eMail, int phoneNum) {
		super();
		this.id = id;
		this.name = name;
		this.eMail = eMail;
		this.phoneNum = phoneNum;
	}
	
	public Student(String name, String eMail, int phoneNum) {
		super();
		this.name = name;
		this.eMail = eMail;
		this.phoneNum = phoneNum;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", eMail=" + eMail + ", phoneNum=" + phoneNum + "]";
	}
}

