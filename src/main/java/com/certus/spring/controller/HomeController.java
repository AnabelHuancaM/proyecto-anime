package com.certus.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.certus.spring.models.Personaje;
import com.certus.spring.service.MascotaService;



@Controller
@RequestMapping("/app") //indicando ruta inicial
public class HomeController {
	
	@Value("${title.generic}")            //evaluando el titulo del propertis
	private String titlePage;
	
	private MascotaService mascota =  new MascotaService();
	
	@GetMapping({"/home1", "/valentino", "/Home1"})      
	public String HolaMundo(Model model) {
		model.addAttribute("TituloPagina", titlePage);
		model.addAttribute("titulo1", "Esta es la lista de mascotas");
		model.addAttribute("listita1", mascota.crearMascota());
		model.addAttribute("Estado1", "");
		return "Home";
	}

	
	
	
	@GetMapping({"/home2", "/anabel", "/Home2"})          
	public String HolaMundo2(Model model) {
		
		model.addAttribute("TituloPagina", titlePage);
		
		//creando personaje 1
		Personaje personaje = new Personaje();
		
		//determinando nombre del personaje(atributo del model personaje)
		personaje.setNombre("Ace");
		personaje.setEdad("14");
		personaje.setSerie("One Piece");
		personaje.setEstado("Morido");
		personaje.setNacimiento("14-10-22");
		
		
		List<Personaje> listita2 = new ArrayList<>();
		listita2.add(personaje); //añadiendo personaje 1
		
		model.addAttribute("tituloPagina", titlePage);
		model.addAttribute("titulo2", "Lista de personajes");
		model.addAttribute("listita2", listita2);
		
		
		
		return "Home2";
	}

}
