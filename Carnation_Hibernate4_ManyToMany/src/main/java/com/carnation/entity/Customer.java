package com.carnation.entity;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class Customer {

	@Id
	private int userId;
	private String name;
	private String address;
	
	
	@ManyToMany
	@JoinTable(name = "u_d",
	joinColumns = {@JoinColumn(name = "usr_id")},
	inverseJoinColumns = {@JoinColumn(name = "dcmnt_id")}
)
	
	
	private List<Bank> documents;
	
	
	
	public List<Bank> getDocuments() {
		return documents;
	}
	public void setDocuments(List<Bank> documents) {
		this.documents = documents;
	}
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", name=" + name + ", address=" + address + ", documents=" + documents
				+ "]";
	}
	
	
}