package com.sp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("homeController")
public class HomeController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";		
	}
}
