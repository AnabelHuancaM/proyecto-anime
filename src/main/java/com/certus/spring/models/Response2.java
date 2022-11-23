package com.certus.spring.models;

import java.util.List;

public class Response2<T> {
	private boolean estado2;
	private String mensaje2;
	private List<T> data2;
	
	public boolean getEstado2() {
		return estado2;
	}
	public void setEstado2(boolean estado2) {
		this.estado2 = estado2;
	}
	public String getMensaje2() {
		return mensaje2;
	}
	public void setMensaje2(String mensaje2) {
		this.mensaje2 = mensaje2;
	}
	public List<T> getData2() {
		return data2;
	}
	public void setData2(List<T> data2) {
		this.data2 = data2;
	}
	
	
	

	
	
	
	}