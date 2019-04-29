package edu.usal.negocio.negocio.dto;

import java.util.Date;

public class Ventas {
	private String cliente;
	private int vuelo;
	private String formaDePago;
	private int idVentas;
	private Date fechaVenta;
	private int idAerolinea;
	
	
	public String getCliente() {
		return cliente;
	}
	public int getVuelo() {
		return vuelo;
	}
	public String getFormaDePago() {
		return formaDePago;
	}
	public int getIdVentas() {
		return idVentas;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public void setVuelo(int vuelo) {
		this.vuelo = vuelo;
	}
	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}
	public void setIdVentas(int idVentas) {
		this.idVentas = idVentas;
	}
	public Date getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public int getIdAerolinea() {
		return idAerolinea;
	}
	public void setIdAerolinea(int idAerolinea) {
		this.idAerolinea = idAerolinea;
	}
}
