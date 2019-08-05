package com.cts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class UserController {
	
	@RequestMapping("fetch")
	public ModelAndView getData() {
		ModelAndView mv = new ModelAndView("users");
		System.out.println("finding all users");
		return mv;
	}
	
//	@RequestMapping(value="login", method=RequestMethod.GET)
	@GetMapping("login")
	public String getLoginPage() {
		return "login";
	}
	
//	@RequestMapping(value="login", method=RequestMethod.POST)
	@PostMapping("login")
	public ModelAndView getLogin(@RequestParam("emailId") String email, @RequestParam String password) {
		ModelAndView mav = null;
		System.out.println(email);
		System.out.println(password);
		if(email.equals("admin@gmail.com") && password.equals("890")) {
			System.out.println("valid user");
			mav = new ModelAndView("welcome");
			mav.addObject("data", "Welocome "+email);
		} else {
			System.out.println("invalid user");
			mav = new ModelAndView("login");
		}
		return mav;
	}
	
}
