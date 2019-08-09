package com.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class UserController {
	@GetMapping("/user")
	public List<String> getFriendList(){
		List<String> list = new ArrayList<>();
		list.add("Aruna");
		list.add("Karan");
		list.add("Nikhil");
		list.add("Sriteja");
		list.add("Kisan");
		list.add("Vipul");
		list.add("Lavish");
		list.add("Kiriti");
		
		return list;
	}
}
