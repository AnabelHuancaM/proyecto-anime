package com.certus.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home") //indicando ruta inicial
	public String HolaMundo() {
		return "Home";
	}

	
	//@GetMapping("/home", "/")
}
