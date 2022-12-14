package com.certus.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.certus.spring.service.PersonajeService;
import com.certus.spring.models.Mascota;
import com.certus.spring.models.Personaje;
import com.certus.spring.service.MascotaService;


@Controller
@RequestMapping("/app") //indicando ruta inicial
public class HomeController {
	
	@Value("${title.generic}")            //evaluando el titulo del propertis
	private String titlePage;
	

@Autowired
	private PersonajeService personajes = new PersonajeService(); 
	private MascotaService mascota =  new MascotaService();	//service personaje

	
	@GetMapping({"/home1", "/valentino", "/Home1"})      
	public String HolaMundo(Model model) {
		model.addAttribute("TituloPagina", titlePage);
		model.addAttribute("titulo1", "Esta es la lista de mascotas");
		model.addAttribute("listita1", mascota.crearMascota());
		model.addAttribute("Estado1", "");
		
		if(mascota.crearMascota().getEstado1()) {
			model.addAttribute("listita1", mascota.crearMascota().getData1());

		}
		model.addAttribute("Estado1", mascota.crearMascota().getMensaje1());
		
		return "Home1";
	}



	@GetMapping({"/home2", "/anabel", "/Home2"})          //indicando las rutas que llamaremos
	public String HolaMundo2(Model model) {
		model.addAttribute("tituloPagina", titlePage);
		model.addAttribute("titulo2", "Listado de personajes");
		
		if (personajes.crearPersonaje().getEstado2()) {

			model.addAttribute("listita2", personajes.crearPersonaje().getData2()); //trae del service
		}

		model.addAttribute("Estado2", personajes.crearPersonaje().getMensaje2());
		
		return "Home2";
	}
	
	@GetMapping({"/home","/Home", "/"})
	public String Inicio(Model model) {
		
		
		model.addAttribute("tituloPagina", titlePage);
		
		
		
		return "Home";
	}
	
	
	
	
	
	@GetMapping({"/form1", "/Form1"})
	public String FormularioMascota(Model model) {
		
		
		model.addAttribute("tituloPagina", titlePage);
		model.addAttribute("tituloFormulario1", "Formulario Mascota");
		model.addAttribute("info", personajes.crearPersonaje());
		
		return "Formulario1";
	}
	
	//llamando a formulario 2
	@GetMapping({"/form2","/Form2"})
	public String FormPersonaje(Model model) {
				
		model.addAttribute("tituloPagina", titlePage);
		model.addAttribute("titulo2", "Formulario de personajes :D");
		model.addAttribute("info", personajes.crearPersonaje());
		
		return "Form2";
	}
	
	
	
	
	
	
	
	
	
	
	

}
