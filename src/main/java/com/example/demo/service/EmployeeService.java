package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeerepository;

	public Employee create(String name, String dept, String manager)
	{
		return employeerepository.save(new Employee(name, dept, manager));
	}
	public List<Employee> getAll()
	{
		return employeerepository.findAll();
	}
}
