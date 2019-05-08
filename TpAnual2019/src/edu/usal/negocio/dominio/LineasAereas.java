package edu.usal.negocio.dto;

public class LineasAereas {
	
	String NombreAerolinea, Alianza, Vuelos;

	public String getNombreAerolinea() {
		return NombreAerolinea;
	}

	public void setNombreAerolinea(String nombreAerolinea) {
		NombreAerolinea = nombreAerolinea;
	}

	public String getAlianza() {
		return Alianza;
	}

	public void setAlianza(String alianza) {
		Alianza = alianza;
	}

	public String getVuelos() {
		return Vuelos;
	}

	public void setVuelos(String vuelos) {
		Vuelos = vuelos;
	}

	public LineasAereas(String nombreAerolinea, String alianza, String vuelos) {
		super();
		NombreAerolinea = nombreAerolinea;
		Alianza = alianza;
		Vuelos = vuelos;
	}
	
	public LineasAereas() {
		
	}	

}
