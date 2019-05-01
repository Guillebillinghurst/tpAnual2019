package edu.usal.negocio.dominio;

import java.util.ArrayList;

public class Aerolinea {
	
	private String Nombre;
	private ArrayList<Vuelo> Vuelos;
	private int idAerolinea;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public ArrayList<Vuelo> getVuelos() {
		return Vuelos;
	}
	public void setVuelos(ArrayList<Vuelo> vuelos) {
		Vuelos = vuelos;
	}
	public int getIdAerolinea() {
		return idAerolinea;
	}
	public void setIdAerolinea(int idAerolinea) {
		this.idAerolinea = idAerolinea;
	}
}
