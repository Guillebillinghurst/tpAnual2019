package edu.usal.negocio.dominio;

import java.util.Date;

public class Vuelo {
	
	private int numVuelo;
	private int cantAsientos;
	private int aeropuertoSalida;
	private int aeropuertoLlegada;
	private Date fechaHoraLlegada;
	private Date fechaHoraSalida;
	private int idAerolinea;
	
	public int getNumVuelo() {
		return numVuelo;
	}
	public void setNumVuelo(int numVuelo) {
		this.numVuelo = numVuelo;
	}
	public int getCantAsientos() {
		return cantAsientos;
	}
	public void setCantAsientos(int cantAsientos) {
		this.cantAsientos = cantAsientos;
	}
	public int getAeropuertoSalida() {
		return aeropuertoSalida;
	}
	public void setAeropuertoSalida(int aeropuertoSalida) {
		this.aeropuertoSalida = aeropuertoSalida;
	}
	public int getAeropuertoLlegada() {
		return aeropuertoLlegada;
	}
	public void setAeropuertoLlegada(int aeropuertoLlegada) {
		this.aeropuertoLlegada = aeropuertoLlegada;
	}
	public Date getFechaHoraLlegada() {
		return fechaHoraLlegada;
	}
	public void setFechaHoraLlegada(Date fechaHoraLlegada) {
		this.fechaHoraLlegada = fechaHoraLlegada;
	}
	public Date getFechaHoraSalida() {
		return fechaHoraSalida;
	}
	public void setFechaHoraSalida(Date fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}
	public int getIdAerolinea() {
		return idAerolinea;
	}
	public void setIdAerolinea(int idAerolinea) {
		this.idAerolinea = idAerolinea;
	}
}
