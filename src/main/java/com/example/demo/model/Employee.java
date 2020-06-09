package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {

	@Id
	String id;
	String name;
	String dept;
	String manager;
	
	public Employee(String name,String dept, String manager)
	{
		this.name=name;
		this.dept=dept;
		this.manager=manager;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}
	public String toString()
	{
		return ("Employee name: "+name+" dept: "+dept+" manager: "+manager);
	}
}
