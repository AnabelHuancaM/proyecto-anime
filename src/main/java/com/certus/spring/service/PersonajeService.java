package com.certus.spring.service;

import java.util.ArrayList;
import java.util.List;

import com.certus.spring.models.Personaje;

//clase personaje service
public class PersonajeService {
	
	//crud
	public List<Personaje> crearPersonaje() { 

		Personaje personaje1 = new Personaje();		//creando personaje 1
		
		List<Personaje> listita2 = new ArrayList<>();
		
		//determinando nombre del personaje(atributo del model personaje)
		personaje1.setNombre("Ace");
		personaje1.setEdad("14");
		personaje1.setSerie("One Piece");
		personaje1.setEstado("Morido");
		personaje1.setNacimiento("14-10-22");

		
		//personaje2-----------------
		Personaje personaje2 = new Personaje();		//creando personaje 1
				
		//determinando nombre del personaje(atributo del model personaje)
		personaje2.setNombre("Maki Zenin");
		personaje2.setEdad("18");
		personaje2.setSerie("Jujutsu Kaisen");
		personaje2.setEstado("Viva");
		personaje2.setNacimiento("14-10-22");
		
		//llamando a personaje 1 y 2
		listita2.add(personaje1); //añadiendo personaje 1
		listita2.add(personaje2);
		

		return listita2; //retorna estado de creacion
		
	}
	
	public String editarPersonaje() { 
		
		return "Personaje editado"; //retorna mensaje
	}
	
	public String eliminarPersonaje() { 
		
		return "Personaje borrado"; //retorna mensaje
	}
}
