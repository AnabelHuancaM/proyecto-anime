package com.certus.spring.models;

import java.util.List;

public class Response1<T> {
	private boolean estado1;
	private String mensaje1;
	private List<T> data1;
	
	
	public boolean getEstado1() {
		return estado1;
	}
	public void setEstado1(boolean estado1) {
		this.estado1 = estado1;
	}
	public String getMensaje1() {
		return mensaje1;
	}
	public void setMensaje1(String mensaje1) {
		this.mensaje1 = mensaje1;
	}
	public List<T> getData1() {
		return data1;
	}
	public void setData1(List<T> data1) {
		this.data1 = data1;
	}
	
	
	

	
	
	
	}