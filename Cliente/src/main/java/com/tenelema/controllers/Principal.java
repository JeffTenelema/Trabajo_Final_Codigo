package com.tenelema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Principal {
	
	@RequestMapping("/")
	public String main() {
		return "index";
	}

}
