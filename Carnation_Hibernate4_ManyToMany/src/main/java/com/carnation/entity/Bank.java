package com.carnation.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Id;

@Entity
public class Bank {
	
	@Id
	private int id;
	private String name;
	private String branch;
	
	
	
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}
	
	
	
	
	
	
}