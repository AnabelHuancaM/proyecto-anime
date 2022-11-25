package com.certus.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.certus.spring.models.Personaje;
import com.certus.spring.models.Response2;


//clase personaje service
@Service
public class PersonajeService {
	
	public Response2<Personaje> crearPersonaje() { 
		boolean estadoCreacion = false;
		
		Response2<Personaje> response2 = new Response2<>();
		
		List<Personaje> listita2 = new ArrayList<>();
		
		
		//determinando nombre del personaje(atributo del model personaje)
		Personaje personaje1 = new Personaje();		//creando personaje 1
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
		listita2.add(personaje1); 
		listita2.add(personaje2);
		
		
		//validando la lista de personajes
		if (listita2.size() > 0) {
			estadoCreacion = true;
			response2.setEstado2(true);
			response2.setMensaje2("Creado correctamente");
			response2.setData2(listita2);
		}else {
			response2.setEstado2(estadoCreacion);
			response2.setMensaje2("Se produjo un error D:");
		}
		
		
		estadoCreacion = true; //retorna estado de creacion true
				
		return response2; 
				
	}
	
	
	
	public String editarPersonaje() { 
		
		return "Personaje editado"; //retorna mensaje
	}
	
	public String eliminarPersonaje() { 
		
		return "Personaje borrado"; //retorna mensaje
	}
}
