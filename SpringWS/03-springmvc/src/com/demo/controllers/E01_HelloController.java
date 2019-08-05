package com.demo.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.entity.User;

@Controller
public class E01_HelloController {

	// localhost:8080/mvc/hello
	@RequestMapping(method=RequestMethod.GET, value="/hello")
	public String sayHello(Model model){
		model.addAttribute("username", "User");
		return "hello";
	}

	@RequestMapping(method=RequestMethod.GET, value="/hello/{name}")
	public ModelAndView sayHello2(@PathVariable("name") String name){
		System.out.println("User name is : "+name);
		ModelAndView mav = new ModelAndView("hello");
		mav.addObject("username", name);
		return mav;
	}

	@RequestMapping(value="login", method=RequestMethod.GET)
	public String getLoginPage(){
			return "user/login";
	}


	@RequestMapping(value="login", method=RequestMethod.POST)
	public String getLogin(HttpServletRequest req, HttpServletResponse res, Model model){
		String userid = req.getParameter("userid");
		String password = req.getParameter("pwd");
		String resultPage = null;
		
		// verify this user in database
		if(userid.trim().length()>0 && userid.equals(password)){
			resultPage = "user/welcome";
			model.addAttribute("username", userid);
			
		} else {
			resultPage = "user/login";
		}
		System.out.println(resultPage);
		return resultPage;
	}
	
	@RequestMapping(value="login2", method=RequestMethod.POST)
	public String getLogin2(
			@RequestParam String userid, 
			@RequestParam("pwd") String password, 
			Model model){
		String resultPage = null;
		System.out.println("in login 2 handler");
		
		// verify this user in database
		if(userid.trim().length()>0 && userid.equals(password)){
			resultPage = "user/welcome";
			model.addAttribute("username", userid);
		} else {
			resultPage = "user/login";
			
		}
		System.out.println(resultPage);
		return resultPage;
	}
	
	
	@RequestMapping(value="signup", method=RequestMethod.GET)
	public String getSignUpPage(){
		return "user/signup";
	}
	
	@RequestMapping(value="signup", method=RequestMethod.POST)
	public String handleSignUp(@ModelAttribute User user, Model model){
		System.out.println(user);
		model.addAttribute("username", user.getUserid());
		return "user/welcome";
	}
	
	
		@RequestMapping(value="signup2", method=RequestMethod.POST)
		public String handleSignUp(@ModelAttribute @Valid User user, BindingResult result, Model model){
			System.out.println(user);
			System.out.println("BindingResult is : "+result);
			if(result.hasErrors()){
				System.out.println("error");
//				model.addAttribute("userIdError", "userid is blank");
				return "user/signup";
			} else {
				model.addAttribute("username", user.getUserid());
				return "user/welcome";
			}
		}
		


}
