package com.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.demo.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
//	public List<Employee> fetchEmployees();
//	public Employee save();
	
//	default public Employee findMyEmployee() {
//		return null;
//	}
}
