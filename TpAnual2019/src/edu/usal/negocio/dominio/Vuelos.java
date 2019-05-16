package edu.usal.negocio.dominio;

import java.util.Date;

public class Vuelos {

	private String nroVuelo;
	private int cantAsientos;
	private Aeropuerto aeropuertoSalida = new Aeropuerto();
	private Aeropuerto aeropuertoLlegada = new Aeropuerto();
	private Date fechaSalida, horaSalida, fechaLlegada, horaLlegada;
	private String tiempoVuelo;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNroVuelo() {
		return nroVuelo;
	}
	public void setNroVuelo(String nroVuelo) {
		this.nroVuelo = nroVuelo;
	}
	public int getCantAsientos() {
		return cantAsientos;
	}
	public void setCantAsientos(int cantAsientos) {
		this.cantAsientos = cantAsientos;
	}
	public Aeropuerto getAeropuertoSalida() {
		return aeropuertoSalida;
	}
	public void setAeropuertoSalida(Aeropuerto aeropuertoSalida) {
		this.aeropuertoSalida = aeropuertoSalida;
	}
	public Aeropuerto getAeropuertoLlegada() {
		return aeropuertoLlegada;
	}
	public void setAeropuertoLlegada(Aeropuerto aeropuertoLlegada) {
		this.aeropuertoLlegada = aeropuertoLlegada;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public Date getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}
	public Date getFechaLlegada() {
		return fechaLlegada;
	}
	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}
	public Date getHoraLlegada() {
		return horaLlegada;
	}
	public void setHoraLlegada(Date horaLlegada) {
		this.horaLlegada = horaLlegada;
	}
	public String getTiempoVuelo() {
		return tiempoVuelo;
	}
	public void setTiempoVuelo(String tiempoVuelo) {
		this.tiempoVuelo = tiempoVuelo;
	}
	public Vuelos(String nroVuelo, int cantAsientos, Aeropuerto aeropuertoSalida, Aeropuerto aeropuertoLlegada,
			Date fechaSalida, Date horaSalida, Date fechaLlegada, Date horaLlegada, String tiempoVuelo) {
		super();
		this.nroVuelo = nroVuelo;
		this.cantAsientos = cantAsientos;
		this.aeropuertoSalida = aeropuertoSalida;
		this.aeropuertoLlegada = aeropuertoLlegada;
		this.fechaSalida = fechaSalida;
		this.horaSalida = horaSalida;
		this.fechaLlegada = fechaLlegada;
		this.horaLlegada = horaLlegada;
		this.tiempoVuelo = tiempoVuelo;
	}
	
	public Vuelos() {
	}	
}
