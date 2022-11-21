package com.certus.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app") //indicando ruta inicial
public class HomeController {
	
	@Value("${title.generic}")            //evaluando el titulo del propertis
	private String titlePage;
	
	
	@GetMapping({"/home1", "/valentino", "/Home1"})            //indicando las rutas que llamaremos
	public String HolaMundo(Model model) {
		model.addAttribute("TituloPagina", titlePage);
		
		return "Home";
	}

	@GetMapping({"/home2", "/anabel", "/Home2"})          //indicando las rutas que llamaremos
	public String HolaMundo2() {
		return "Home2";
	}

}
