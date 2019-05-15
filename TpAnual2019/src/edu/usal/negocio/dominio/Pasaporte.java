package edu.usal.negocio.dominio;

import java.io.Serializable;
import java.util.Date;

public class Pasaporte implements Serializable{
	
	private int id;
	private String NroPasaporte, paisEmision, autoridadEmision;
	private Date fechaEmision, fechaVencimiento;
	
	public String getNroPasaporte() {
		return NroPasaporte;
	}
	public void setNroPasaporte(String nroPasaporte) {
		NroPasaporte = nroPasaporte;
	}
	public String getPaisEmision() {
		return paisEmision;
	}
	public void setPaisEmision(String paisEmision) {
		this.paisEmision = paisEmision;
	}
	public String getAutoridadEmision() {
		return autoridadEmision;
	}
	public void setAutoridadEmision(String autoridadEmision) {
		this.autoridadEmision = autoridadEmision;
	}
	public Date getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public Pasaporte(String nroPasaporte, String paisEmision, String autoridadEmision, Date fechaEmision,
			Date fechaVencimiento) {
		super();
		NroPasaporte = nroPasaporte;
		this.paisEmision = paisEmision;
		this.autoridadEmision = autoridadEmision;
		this.fechaEmision = fechaEmision;
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
	public Pasaporte () {
		
	}
	

}
