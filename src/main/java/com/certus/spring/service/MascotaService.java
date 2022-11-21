package com.certus.spring.service;

import java.util.ArrayList;
import java.util.List;

import com.certus.spring.models.Mascota;

public class MascotaService {

	public List<Mascota> crearMascota() {

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

		estadoCreacion = true;

		return listita1;
	}

	
	
	
	public String EditarMascota() {

		return "Mascota editada";
	}

	public String EliminarMascota() {

		return "Mascota eliminada";
	}
}
