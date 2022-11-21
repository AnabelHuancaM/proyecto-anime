package com.certus.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.certus.spring.models.Mascota;

@Controller
@RequestMapping("/app") //indicando ruta inicial
public class HomeController {
	
	@Value("${title.generic}")            //evaluando el titulo del propertis
	private String titlePage;
	
	
	@GetMapping({"/home1", "/valentino", "/Home1"})            //indicando las rutas que llamaremos
	public String HolaMundo(Model model) {
		
		
		Mascota mascota1 = new Mascota();
		
		mascota1.setNombre("Manchita");
		mascota1.setTipo("Gato");
		mascota1.setRaza("Atigrado");
		mascota1.setColor("Blanco con manchas medias plomas");
		mascota1.setEdad("1 año");
			
		List<Mascota> listita1 = new ArrayList<>();
		listita1.add(mascota1);
		
		
		model.addAttribute("TituloPagina", titlePage);
		model.addAttribute("titulo1", "Esta es la lista de mascotas");
		model.addAttribute("listita1", listita1);
		return "Home";
	}

	@GetMapping({"/home2", "/anabel", "/Home2"})          //indicando las rutas que llamaremos
	public String HolaMundo2(Model model) {
		
		model.addAttribute("TituloPagina", titlePage);
		return "Home2";
	}

}
