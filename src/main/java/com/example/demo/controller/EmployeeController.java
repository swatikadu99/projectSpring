package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	@RequestMapping("/create")
	public String create(@RequestParam String name,@RequestParam String dept, @RequestParam String manager)
	{
		Employee e= employeeservice.create(name, dept, manager);
		return e.toString();
	}
	
	@RequestMapping("/getAll")
	public List<Employee> getAll()
	{
		return employeeservice.getAll();
		
	}
}
