package com.certus.spring.service;

import java.util.ArrayList;
import java.util.List;

import com.certus.spring.models.Mascota;
import com.certus.spring.models.Response1;

public class MascotaService {

	public Response1<Mascota> crearMascota() {

		
		
		Response1<Mascota> response1 = new Response1<>();
		boolean estadoCreacion = false;
		
		List<Mascota> listita1 = new ArrayList<>();

		//creando segunda mascota
		
		Mascota mascota1 = new Mascota();

		mascota1.setNombre("Manchita");
		mascota1.setTipo("Gato");
		mascota1.setRaza("Atigrado");
		mascota1.setColor("Blanco con manchas medias plomas");
		mascota1.setEdad("1 año");
		
		//Creando segunda mascota
		
		Mascota mascota2 = new Mascota();

		mascota2.setNombre("Tato");
		mascota2.setTipo("Gato");
		mascota2.setRaza("atigrado");
		mascota2.setColor("naranja");
		mascota2.setEdad("2 año");

		
		//agregando la mascota a la lista
		listita1.add(mascota1);
		listita1.add(mascota2);

	
		
		//Validacion de lista de personajes
		if(listita1.size() > 0) {
			estadoCreacion = true;
			response1.setEstado1(estadoCreacion);
			response1.setMensaje1("Creado correctamente");
			response1.setData1(listita1);
		}else {
			response1.setEstado1(estadoCreacion);
			response1.setMensaje1("Se produjo un error al crear la mascota");
		}
		
		
		
		
		
		

		return response1;
	}

	
	
	
	public String EditarMascota() {

		return "Mascota editada";
	}

	public String EliminarMascota() {

		return "Mascota eliminada";
	}
}
