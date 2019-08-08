package com.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Employee;

//SpringMVC controller
//SpringRest controller
@Controller
@RequestMapping("/user")
public class EmployeeController {

	@GetMapping("/login")
	public String getLoginPage() {
		return "/emp/login";
	}
	
	@GetMapping(value="list", produces= {
			MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE
	})
	@ResponseBody
	public List<Employee> getEmpsData(){
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "ABC"));
		list.add(new Employee(201, "XYZ"));
		list.add(new Employee(11, "MNO"));
		list.add(new Employee(55, "PQR"));
		
		return list;
	}
	
	
	@PostMapping(value="login2", consumes= {
			MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE
	}, produces= {
			MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE
	})
	public ResponseEntity<Employee> getLogin(@RequestBody Employee emp) {
		System.out.println(emp);
		// db
		if(emp.getEmail().equals(emp.getPassword())) {
			System.out.println("Valid employee");
			return new ResponseEntity<Employee>(emp, HttpStatus.FOUND);
		} else {
			System.out.println("Invalid");
			return ResponseEntity
					.status(204)
					.header("message", "emp not found")
					.build();
		}
	}
}
