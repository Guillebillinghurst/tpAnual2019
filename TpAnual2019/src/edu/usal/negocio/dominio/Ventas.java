package edu.usal.negocio.dominio;

import java.util.*;

public class Ventas {
	
	int id;
	Date fechaVenta, horaVenta;
	String formaPago;
	Cliente cliente;
	Vuelos vuelo;
	LineasAereas lineaaerea;
	
	public int getId() {
		return id;
	}
	public Ventas (){}
	
	public Ventas(int id, Date fechaVenta, Date horaVenta, String formaPago, Cliente cliente, Vuelos vuelo,
			LineasAereas lineaaerea) {
		super();
		this.id = id;
		this.fechaVenta = fechaVenta;
		this.horaVenta = horaVenta;
		this.formaPago = formaPago;
		this.cliente = cliente;
		this.vuelo = vuelo;
		this.lineaaerea = lineaaerea;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public Date getHoraVenta() {
		return horaVenta;
	}
	public void setHoraVenta(Date horaVenta) {
		this.horaVenta = horaVenta;
	}
	public String getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vuelos getVuelo() {
		return vuelo;
	}
	public void setVuelo(Vuelos vuelo) {
		this.vuelo = vuelo;
	}
	public LineasAereas getLineaaerea() {
		return lineaaerea;
	}
	public void setLineaaerea(LineasAereas lineaaerea) {
		this.lineaaerea = lineaaerea;
	}
}
