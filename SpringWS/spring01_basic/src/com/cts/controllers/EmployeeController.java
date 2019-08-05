package com.cts.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Employee;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	List<Employee> list= new ArrayList();
	EmployeeController(){
		list.add(new Employee(21, "Jakarta"));
		list.add(new Employee(32, "Mike"));
	}
	@GetMapping("greet")
//	@ResponseBody
	public String sayHello() {
		return "emp/hello";
	}
	
	@GetMapping(value="list", produces=MediaType.APPLICATION_JSON_VALUE)
//	@ResponseBody
	public List<Employee> getEmpList(){
		// fetch from db
		
		return list;
	}
	@GetMapping(value="xlist", produces=MediaType.APPLICATION_XML_VALUE)
//	@ResponseBody
	public List<Employee> getEmpList2(){
		// fetch from db
		return list;
	}
	
	@PostMapping(value="add", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
//	@ResponseBody
	public List<Employee> addEmp(@RequestBody Employee emp){
		// fetch from db
		list.add(emp);
		return list;
	}
	

}
