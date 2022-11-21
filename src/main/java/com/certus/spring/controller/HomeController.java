package com.certus.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app") //indicando ruta inicial
public class HomeController {
	
	@GetMapping("/home")  //indicando las rutas que llamaremos
	public String HolaMundo() {
		return "Home";
	}

	@GetMapping("/home2")  //indicando las rutas que llamaremos
	public String HolaMundo2() {
		return "Home2";
	}
	//@GetMapping("/home", "/")
}
