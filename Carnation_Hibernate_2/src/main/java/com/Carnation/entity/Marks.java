package com.Carnation.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ForeignKey;

@Entity
public class Marks implements Serializable {

	@Id
	
	private int id;
    
	@OneToOne
   // @JoinColumn(name = "Student_id")
    private Student student;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	private int math;
	 private int english;

	@Override
	public String toString() {
		return "Marks [id=" + id + ", student=" + student + ", math=" + math + ", english=" + english + "]";
	}
	
	 
	
	
	
	
	
	 
	 
}
