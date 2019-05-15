package edu.usal.negocio.dominio;

import java.io.Serializable;

public class Telefono implements Serializable {
	
	private String nroPersonal, nroCelular, nroLaboral;
	private int id;
	

	public String getNroPersonal() {
		return nroPersonal;
	}

	public void setNroPersonal(String nroPersonal) {
		this.nroPersonal = nroPersonal;
	}

	public String getNroCelular() {
		return nroCelular;
	}

	public void setNroCelular(String nroCelular) {
		this.nroCelular = nroCelular;
	}

	public String getNroLaboral() {
		return nroLaboral;
	}

	public void setNroLaboral(String nroLaboral) {
		this.nroLaboral = nroLaboral;
	}

	public Telefono(String nroPersonal, String nroCelular, String nroLaboral) {
		super();
		this.nroPersonal = nroPersonal;
		this.nroCelular = nroCelular;
		this.nroLaboral = nroLaboral;
	}
	
	public Telefono() {
		
	}

}
