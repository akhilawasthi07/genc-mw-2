package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping("employee")
	public Employee getEmployee() {
		return new Employee();
	}
}
