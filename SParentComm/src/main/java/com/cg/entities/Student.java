package com.cg.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name = "student_cp")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	private LocalDate dateOfBirth;
	private String name;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "building_name")
//	private Address address;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "classdairy_id")
//	private ClassDiary classDiary;
	private String emailId;
	private String mobileNumber;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "classId")
	private ClassId currentClass;
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private List<Subject> subjects = new ArrayList<>();
	
	public Student() {
		super();
		
	}
	
	public Student(LocalDate dateOfBirth, String name, String emailId, String mobileNumber,
			ClassId currentClass, List<Subject> subjects) {
		this.dateOfBirth = dateOfBirth;
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.currentClass = currentClass;
		this.subjects = subjects;
	}

	public Student(long userId, LocalDate dateOfBirth, String name, String emailId, String mobileNumber) {
		super();
		this.userId = userId;
		this.dateOfBirth = dateOfBirth;
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}

	public Student( LocalDate dateOfBirth, String name, String emailId, String mobileNumber, ClassId currentClass) {
		this.dateOfBirth = dateOfBirth;
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.currentClass = currentClass;
	}
//	public Student(long userId, LocalDate dateOfBirth, ClassId currentClass, List<Subject> subjects, String name,
//			Address address, ClassDiary classDiary, String emailId, String mobileNumber) {
//		super();
//		this.userId = userId;
//		this.dateOfBirth = dateOfBirth;
//		this.currentClass = currentClass;
//		this.subjects = subjects;
//		this.name = name;
//		this.address = address;
//		this.classDiary = classDiary;
//		this.emailId = emailId;
//		this.mobileNumber = mobileNumber;
//		
//	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public ClassId getCurrentClass() {
		return currentClass;
	}
	public void setCurrentClass(ClassId currentClass) {
		this.currentClass = currentClass;
	}
	  
	public void addSubject(Subject subject) 
	{
		subject.setStudent(this);
		subjects.add(subject);
	}	
	
}
