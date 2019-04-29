package edu.usal.negocio.negocio.dto;

import java.util.Date;

public class Pasaporte {
	private String NumPasaporte;
	private String PaisEmision;
	private Date FechaEmision;
	private Date FechaVencimiento;
	
	public String getNumPasaporte() {
		return NumPasaporte;
	}
	public void setNumPasaporte(String numPasaporte) {
		NumPasaporte = numPasaporte;
	}
	public String getPaisEmision() {
		return PaisEmision;
	}
	public void setPaisEmision(String paisEmision) {
		PaisEmision = paisEmision;
	}
	public Date getFechaEmision() {
		return FechaEmision;
	}
	public void setFechaEmision(Date fechaEmision) {
		FechaEmision = fechaEmision;
	}
	public Date getFechaVencimiento() {
		return FechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		FechaVencimiento = fechaVencimiento;
	}
}
