package com.cts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("item")
public class ItemController {

	
	@RequestMapping("fetch")
	public ModelAndView getItems() {
		ModelAndView mv = new ModelAndView("items");
		System.out.println("finding all items");

		return mv;
	}
	
}
